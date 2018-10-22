import SizeConversion._
ViewSetting.backgroundImage = Some("file:///put here the backgrund image path")
SenseImageFXOutput.addRepresentation(SensorName.sensor1, "file:/// sensor1 image")
SenseImageFXOutput.addRepresentation(SensorName.sensor3, "file:/// sensor3 image")
ScafiProgramBuilder (
Random(100,1120,780),
SimulationInfo(program = classOf[BlobDroneSystemExplorationDemo],
    metaActions = List(MetaActionProducer.movementDtActionProducer),
    exportValutations = List.empty),
RadiusSimulation(100),
scafiWorldInfo = ScafiWorldInformation(
    boundary = Some(SpatialAbstraction.Bound(Rectangle(1120,780))),
    shape = Some(Rectangle(20,20))),
neighbourRender = true,
performance = NearRealTimePolicy,
outputPolicy = SenseImageFXOutput
).launch()