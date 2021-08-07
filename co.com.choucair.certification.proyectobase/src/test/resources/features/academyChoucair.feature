# Autor: Andrey Alvarez

@stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

    @scenario1
    Scenario: Search for a automation course
      Given than brandon wants to learn automation at the academy Choucair
        | strUser | strPassword |
        | 90627785 | Choucair2021* |
      When he search for the course Recursos Automatización Bancolombia on the Choucair academy platform
        | strCourse   |
        | Metodologia Bancolombia |
      Then he finds the course called
        | strCourse               |
        | Metodologia Bancolombia |