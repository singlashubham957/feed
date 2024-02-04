package feed.service

import feed.data.locationEvent.LocationEventDataI
import feed.models.LocationEvent

class LocationEventsFeed(
    private val locationEventData: LocationEventDataI
) {

    fun addLocationEvent(locationEvent: LocationEvent): String {
        return locationEventData.addLocationEvent(locationEvent)
    }

    fun getLocationEvents(locationId: String): List<LocationEvent> {
        return locationEventData.getLocationEvents(locationId)
    }
}
