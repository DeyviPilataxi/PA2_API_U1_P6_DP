## PROGRAMACION AVANZADA 2
## DEBER
## Beans que se utilizan en cada caso 

## @ApplicationScoped

1 ConfiguradorTasasCredito: Las tasas de interés (ej. 15% anual) son las mismas para todos los procesos de crédito hoy
2 ValidadorInventarioGlobal: Para el procesador de ventas, este bean mantiene la conexión única al sistema de almacén central para verificar si hay stock antes de vender.
3 ConversorMonedas: Mantiene los tipos de cambio (USD a EUR) actualizados para todos los cálculos de venta.
4 GestorReglasNegocio: Carga desde la base de datos las políticas de aprobación de créditos
5 CachéGeográfica: Almacena la lista de países y ciudades para los formularios de registro de clientes.
6 MotorRiesgoCrediticio: Servicio que contiene los algoritmos matemáticos para calcular el scoring de un cliente.
7 SecurityProvider: Verifica los roles y permisos de los empleados que entran al sistema.

## @Dependent

1 AuditLogger: al ser Dependent, puede inyectar automáticamente el nombre de la clase donde se está usando.
2 CalculadoraInteresCompuesto: Realiza el cálculo matemático exacto para un crédito y luego se desecha.
3 ParserXMLVenta: Convierte un archivo XML de un proveedor en un objeto Java de venta.
4 ValidadorFormatoIBAN: Verifica que el número de cuenta para el desembolso del crédito sea válido.
5 GeneradorTicketVenta: Es un objeto que toma los datos de una venta actual, les da formato de texto y los envía a la impresora. No tiene sentido que este objeto viva más allá de esa impresión específica.
6 CalculadoraAmortizacion: l procesador de créditos la usa para proyectar las cuotas de un cliente específico. Una vez que se genera el PDF de la tabla de amortización, la calculadora ya no es necesaria y se destruye junto con ese proceso.
7 GeneradorCodigoBarras: Crea la imagen del código de barras para una etiqueta de venta específica.

## @Singleton

1 FolioVentaConsecutivo: En un procesador de ventas, no puedes permitir que dos ventas tengan el mismo número de factura.
2 MonitorCreditosEnCurso: Un bean que rastrea cuántas solicitudes de crédito se están procesando en tiempo real en todo el servidor para evitar saturar el sistema.
3 SecuenciadorFacturas: Garantiza que los números de factura (001, 002...) sean únicos incluso si 100 personas venden al mismo tiempo.
4 ControladorTurnosAtencion: En una sucursal, gestiona el orden de los clientes que esperan por un crédito.
5 PoolConexionesLegacy: Si conectas con un sistema de créditos muy viejo que solo permite una conexión a la vez.
6 MonitorEstadoServidores: Una tarea que revisa cada 5 minutos si el servicio de la central de riesgo está activo.
7 GestorSemaforoVentas: Si tienes una promoción de "solo 10 créditos con tasa 0%", este bean controla el cupo de forma estricta.
