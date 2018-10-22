ViewSetting.backgroundColor = Color.Beige
SenseImageFXOutput.addRepresentation(SensorName.sensor1, "file:/// sensor1 image")
SenseImageFXOutput.addRepresentation(SensorName.sensor3, "file:/// sensor3 image")
SenseImageFXOutput.addRepresentation(SensorName.sensor4, "file:/// sensor4 image")

val externalBound = Polygon(orientation = 0, Point2D(0,0), Point2D(400,0),Point2D(400,200),Point2D(700,200),Point2D(700,0),
Point2D(1400,0),Point2D(1400,1100),Point2D(400,1100), Point2D(400,900),Point2D(0,900))
val worldBound = SpatialAbstraction.Bound(externalBound)
ScafiProgramBuilder (
Random(50,2000,2000),
SimulationInfo(program = classOf[SupplyRescueDemo], metaActions = List(MetaActionProducer.movementDtActionProducer),exportValutations = List.empty),
RadiusSimulation(500),
neighbourRender = true,
scafiWorldInfo = ScafiWorldInformation(boundary = Some(worldBound),
    shape = Some(Circle(20))),
outputPolicy = SenseImageFXOutput,
performance = NearRealTimePolicy
).launch()