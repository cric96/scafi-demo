ScafiProgramBuilder (
    Random(500,1920,1080),
    SimulationInfo(program = classOf[Channel]),
    RadiusSimulation(radius = 140),
    neighbourRender = true,
    outputPolicy = FastFXOutput,
    performance = NearRealTimePolicy,
    scafiWorldInfo = ScafiWorldInformation(shape = Some(Circle(5)))
  ).launch()