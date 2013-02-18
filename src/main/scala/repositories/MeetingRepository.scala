package repositories

import org.springframework.data.neo4j.repository.GraphRepository
import models.Meeting
import org.springframework.stereotype.Repository

@Repository
trait MeetingRepository extends GraphRepository[Meeting]

