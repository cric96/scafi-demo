import SizeConversion._
ScafiProgramBuilder (
Random(1000,1000,1000),
SimulationInfo(program = classOf[BasicMovement],
    metaActions = List(MetaActionProducer.movementDtActionProducer),
    exportValutations = List.empty),
RadiusSimulation(40),
neighbourRender = true,
outputPolicy = FastFXOutput,
performance = NearRealTimePolicy
).launch()