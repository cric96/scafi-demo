import SizeConversion._
ViewSetting.backgroundImage = Some("file:///put here the backgrund image path")
SenseImageFXOutput.addRepresentation(SensorName.sensor1, "file:/// sensor1 image")
SenseImageFXOutput.addRepresentation(SensorName.sensor3, "file:/// sensor3 image")
worldSize = (1120,780)
val radius = 100
ScafiProgramBuilder (
Random(100,worldSize._1.toInt,worldSize._2.toInt),
SimulationInfo(program = classOf[BlobDroneSystemExplorationDemo],
    metaActions = List(MetaActionProducer.movementDtActionProducer),
    exportValutations = List.empty),
RadiusSimulation(radius),
scafiWorldInfo = ScafiWorldInformation(
    boundary = Some(SpatialAbstraction.Bound(Rectangle(worldSize._1.toFloat,worldSize._2.toFloat))),
    shape = Some(Rectangle(20,20))),
neighbourRender = true,
performance = NearRealTimePolicy,
outputPolicy = SenseImageFXOutput
).launch()