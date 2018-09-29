ViewSetting.backgroundColor = Color.Beige
SenseImageFXOutput.addRepresentation(SensorName.sensor1, "file:/// sensor1 image")
SenseImageFXOutput.addRepresentation(SensorName.sensor3, "file:/// sensor3 image")
SenseImageFXOutput.addRepresentation(SensorName.sensor4, "file:/// sensor4 image")
import SizeConversion._
val externalBound = Polygon(orientation = 0, Point2D(0,0), Point2D(400,0),Point2D(400,200),Point2D(700,200),Point2D(700,0),
Point2D(1400,0),Point2D(1400,1100),Point2D(400,1100), Point2D(400,900),Point2D(0,900))
val worldBound = SpatialAbstraction.Bound(externalBound)
worldSize = (2000,2000)
val simRadius = 500
ScafiProgramBuilder (
Random(50,worldSize._1.toInt,worldSize._1.toInt),
SimulationInfo(program = classOf[SupplyRescueDemo], metaActions = List(MetaActionProducer.movementDtActionProducer),exportValutations = List.empty),
RadiusSimulation(simRadius),
neighbourRender = true,
scafiWorldInfo = ScafiWorldInformation(boundary = Some(worldBound),
    shape = Some(Circle(20))),
outputPolicy = SenseImageFXOutput,
performance = NearRealTimePolicy
).launch()