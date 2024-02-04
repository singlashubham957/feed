package feed.data.locationEvent

import feed.models.LocationEvent

interface LocationEventDataI {
    fun addLocationEvent(locationEvent: LocationEvent): String
    fun getLocationEvents(locationId: String): List<LocationEvent>
}
