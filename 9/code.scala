import SizeConversion._
worldSize = (1000,1000)
val radius = 40
ScafiProgramBuilder (
Random(1000,worldSize._1.toInt,worldSize._2.toInt),
SimulationInfo(program = classOf[BasicMovement],
    metaActions = List(MetaActionProducer.movementDtActionProducer),
    exportValutations = List.empty),
RadiusSimulation(radius),
neighbourRender = true,
outputPolicy = FastFXOutput,
performance = NearRealTimePolicy
).launch()