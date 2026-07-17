### **📝 Enunciado Express: Sistema de Control de Embalses Hídricos (SCEH).**

Una red de gestión de aguas necesita implementar el núcleo de un sistema que permita registrar transferencias de agua en sus embalses y emitir alertas automáticas ante variaciones críticas.

#### **👨‍🏫 Primera Parte \- Operaciones y Excepciones.**

**📋 Requerimientos.**  
**💧 Embalse.**  
De cada embalse se conoce:

* Identificador del Embalse.  
* Volumen de Agua Actual (en hm³).

Un embalse debe permitir consultar su volumen actual, inyectar agua (incrementar hm³) y extraer agua (reducir hm³).  
**⚙️ Operaciones de Transferencia.**  
El sistema debe soportar inicialmente las operaciones de **Inyección** y **Extracción**. Cada operación encapsula la información necesaria para ejecutarse, conociendo el embalse sobre el que actúa y el volumen de agua (hm³) involucrado.

* A diferencia de sistemas más complejos, **no se requiere** que las operaciones puedan deshacerse, solo deben poder ejecutarse.

**⚠️ Manejo de Excepciones**  
El sistema debe garantizar la consistencia de los datos modelando correctamente las siguientes situaciones anómalas:

1. **Excepción No Verificada (Unchecked Exception):** Si se intenta instanciar una operación con un valor menor o igual a **0 hm³**, el sistema debe lanzar un error de uso indebido. El compilador no debe obligar a capturar esta falla explícitamente.  
2. **Excepción Verificada (Checked Exception):** Se admite una extracción que deje al embalse en un saldo negativo de hasta **\-50 hm³**. Si una extracción intenta forzar al embalse por debajo de este límite absoluto, se debe lanzar un error de regla de negocio. El diseño debe obligar en tiempo de compilación a que quien invoque la operación maneje la situación.

**⚙️ Restricciones de Diseño (Primera Parte).**

* Quien ejecute las operaciones no debe conocer cómo se implementa internamente cada una.  
* Debe ser posible incorporar nuevos tipos de operaciones sin modificar a quien las ejecuta.

#### **👨‍🏫 Segunda Parte \- Alertas Automáticas.**

**📢 Mecanismo de Suscripción** Cada vez que un embalse reciba una inyección o extracción exitosa, los sistemas interesados deben ser informados automáticamente. El embalse debe permitir registrar sistemas, eliminarlos, y avisar a todos los inscriptos cuando ocurra una variación.  
Para esta evaluación, solo se requiere implementar un sistema interesado:

1. **Alarma de Sequía:** Detecta cuándo un embalse queda por debajo de su nivel óptimo (cero hm³) tras una operación exitosa y advierte la situación de saldo técnico negativo.

**⚙️ Restricciones de Diseño (Segunda Parte)**

* El embalse no debe conocer los detalles de las clases concretas de los sistemas periféricos.  
* Evitar el uso de condicionales (if / switch / instanceof) en el embalse para identificar a quién se le está avisando.

#### **⏱️ Condiciones de Evaluación.**

* **Tiempo máximo de resolución:** 60 minutos reloj.  
* **Metodología:** Desarrollo Guiado por Pruebas (TDD).  
* **Métrica de éxito:** Cobertura de código (Code Coverage) de al menos un **75%**.