package feed.data.locationEvent

import feed.models.LocationEvent

interface LocationEventDataI {
    fun addLocationEvent(locationEvent: LocationEvent)
    fun getLocationEvents(locationId: String): List<LocationEvent>
}
