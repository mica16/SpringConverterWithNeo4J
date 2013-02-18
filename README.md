SpringConverterWithNeo4J
========================

Seems that there's a spring-converter issue with neo4j

To figure out the issue, simply download sbt 0.12 (brew install sbt and brew upgrade sbt)  and launch the command: 

sbt run


Output should be some kind of:

Michael's meeting has just been saved :Meeting(michael,MyMeeting,for business,business,Schedule(Mon Feb 18 16:49:14 CET 2013,Mon Feb 18 16:49:14 CET 2013))
Michael's meeting has just been loaded :Meeting(michael,MyMeeting,for business,business,null)
We well notice that Schedule is null :( :null


