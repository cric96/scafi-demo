ScafiProgramBuilder (
    Grid(10,50,50),
    SimulationInfo(program = classOf[Gradient]),
    RadiusSimulation(radius = 10),
    neighbourRender = false,
    outputPolicy = GradientFXOutput,
    performance = NearRealTimePolicy,
    scafiWorldInfo = ScafiWorldInformation(shape = Some(Circle(5)))
  ).launch()