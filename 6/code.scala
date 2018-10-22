ScafiProgramBuilder (
    Grid(4,100,100),
    SimulationInfo(program = classOf[BasicProgram]),
    RadiusSimulation(radius = 4),
    neighbourRender = false,
    outputPolicy = GradientFXOutput
).launch()