package feed.data.locationEvent

import feed.models.LocationEvent

class LocationEventDataImpl : LocationEventDataI {
    private val locationEvents: MutableList<LocationEvent> = mutableListOf()
    override fun addLocationEvent(locationEvent: LocationEvent) {
        locationEvents.add(locationEvent)
    }
    override fun getLocationEvents(locationId: String): List<LocationEvent> {
        return locationEvents.filter { it.locationId == locationId }
    }
}
