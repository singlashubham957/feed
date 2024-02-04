package feed.data.locationEvent

import feed.models.LocationEvent
import feed.models.User

interface LocationEventDataI {
    fun addLocationEvent(locationEvent: LocationEvent): String
    fun getLocationEvents(locationId: String): List<LocationEvent>
}