package de.graphbird.lib.osm.enums;

import org.apache.commons.collections4.map.MultiKeyMap;

// https://wiki.openstreetmap.org/wiki/Map_features
public class OsmKeyValueMap {

	private static OsmKeyValueMap INSTANCE;
	public MultiKeyMap<String, String> osmKeyValueImage = new MultiKeyMap<>();

	private OsmKeyValueMap() {
		// Aerialway
		osmKeyValueImage.put("aerialway", "cable_car", "cablecar.png");
		osmKeyValueImage.put("aerialway", "gondola", "gondola-2.png");
		osmKeyValueImage.put("aerialway", "mixed_lift", "surfacelift.png");
		osmKeyValueImage.put("aerialway", "chair_lift", "skilifting.png");
		osmKeyValueImage.put("aerialway", "drag_lift", "skilifting.png");
		osmKeyValueImage.put("aerialway", "t-bar", "skilifting.png");
		osmKeyValueImage.put("aerialway", "j-bar", "skilifting.png");
		osmKeyValueImage.put("aerialway", "platter", "undef.png");
		osmKeyValueImage.put("aerialway", "rope_tow", "undef.png");
		osmKeyValueImage.put("aerialway", "magic_carpet", "undef.png");
		osmKeyValueImage.put("aerialway", "zip_line", "undef.png");
		osmKeyValueImage.put("aerialway", "goods", "undef.png");
		osmKeyValueImage.put("aerialway", "pylon", "undef.png");
		osmKeyValueImage.put("aerialway", "station", "skistation.png");
		
		// Aeroway
		osmKeyValueImage.put("aeroway", "aerodrome", "airport.png");
		osmKeyValueImage.put("aeroway", "aircraft_crossing", "undef.png");
		osmKeyValueImage.put("aeroway", "apron", "airport_apron.png");
		osmKeyValueImage.put("aeroway", "gate", "airport_terminal.png");
		osmKeyValueImage.put("aeroway", "hangar", "aircraftsmall.png");
		osmKeyValueImage.put("aeroway", "helipad", "helipad.png");
		osmKeyValueImage.put("aeroway", "heliport", "helipad.png");
		osmKeyValueImage.put("aeroway", "navigationaid", "undef.png");
		osmKeyValueImage.put("aeroway", "runway", "airport_runway.png");
		osmKeyValueImage.put("aeroway", "spaceport", "spaceport-2.png");
		osmKeyValueImage.put("aeroway", "taxiway", "taxiway.png");
		osmKeyValueImage.put("aeroway", "terminal", "airport_terminal.png");
		osmKeyValueImage.put("aeroway", "windsock", "undef.png");
		
		// Sustenance
		osmKeyValueImage.put("amenity", "bar", "bar.png");
		osmKeyValueImage.put("amenity", "biergarten", "beergarden.png");
		osmKeyValueImage.put("amenity", "cafe", "cafetaria.png");
		osmKeyValueImage.put("amenity", "fast_food", "fastfood.png");
		osmKeyValueImage.put("amenity", "food_court", "undef.png");
		osmKeyValueImage.put("amenity", "ice_cream", "icecream.png");
		osmKeyValueImage.put("amenity", "pub", "undef.png");
		osmKeyValueImage.put("amenity", "restaurant", "restaurant.png");
		
		// Education
		osmKeyValueImage.put("amenity", "college", "highschool.png");
		osmKeyValueImage.put("amenity", "dancing_school", "dance_class.png");
		osmKeyValueImage.put("amenity", "driving_school", "undef.png");
		osmKeyValueImage.put("amenity", "first_aid_school", "undef.png");
		osmKeyValueImage.put("amenity", "kindergarten", "daycare.png");
		osmKeyValueImage.put("amenity", "language_school", "undef.png");
		osmKeyValueImage.put("amenity", "library", "library.png");
		osmKeyValueImage.put("amenity", "surf_school", "surfing.png");
		osmKeyValueImage.put("amenity", "toy_library", "toys.png");
		osmKeyValueImage.put("amenity", "research_institute", "undef.png");
		osmKeyValueImage.put("amenity", "training", "undef.png");
		osmKeyValueImage.put("amenity", "music_school", "undef.png");
		osmKeyValueImage.put("amenity", "school", "school.png");
		osmKeyValueImage.put("amenity", "traffic_park", "undef.png");
		osmKeyValueImage.put("amenity", "university", "university.png");
		
		// Transportation
		osmKeyValueImage.put("amenity", "bicycle_parking", "bicycle_parking.png");
		osmKeyValueImage.put("amenity", "bicycle_repair_station", "bicycle_shop.png");
		osmKeyValueImage.put("amenity", "bicycle_rental", "bicycle_shop.png");
		osmKeyValueImage.put("amenity", "boat_rental", "boat.png");
		osmKeyValueImage.put("amenity", "boat_sharing", "boat.png");
		osmKeyValueImage.put("amenity", "bus_station", "busstop.png");
		osmKeyValueImage.put("amenity", "car_rental", "carrental.png");
		osmKeyValueImage.put("amenity", "car_sharing", "car_share.png");
		osmKeyValueImage.put("amenity", "car_wash", "carwash.png");
		osmKeyValueImage.put("amenity", "compressed_air", "repair.png");
		osmKeyValueImage.put("amenity", "vehicle_inspection", "repair.png");
		osmKeyValueImage.put("amenity", "charging_station", "e-bike-charging.png");
		osmKeyValueImage.put("amenity", "driver_training", "undef.png");
		osmKeyValueImage.put("amenity", "ferry_terminal", "ferry.png");
		osmKeyValueImage.put("amenity", "fuel", "fillingstation.png");
		osmKeyValueImage.put("amenity", "grit_bin", "undef.png");
		osmKeyValueImage.put("amenity", "motorcycle_parking", "parkinggarage.png");
		osmKeyValueImage.put("amenity", "parking", "parkinggarage.png");
		osmKeyValueImage.put("amenity", "parking_entrance", "undef.png");
		osmKeyValueImage.put("amenity", "parking_space", "parkinggarage.png");
		osmKeyValueImage.put("amenity", "taxi", "taxi.png");
		
		// Financial
		osmKeyValueImage.put("amenity", "atm", "atm-2.png");
		osmKeyValueImage.put("amenity", "bank", "bank_euro.png");
		osmKeyValueImage.put("amenity", "bureau_de_change", "currencyexchange.png");
		
		// Healthcare
		osmKeyValueImage.put("amenity", "baby_hatch", "undef.png");
		osmKeyValueImage.put("amenity", "clinic", "hospital-building.png");
		osmKeyValueImage.put("amenity", "dentist", "dentist.png");
		osmKeyValueImage.put("amenity", "doctors", "hospital-building.png");
		osmKeyValueImage.put("amenity", "hospital", "hospital-building.png");
		osmKeyValueImage.put("amenity", "nursing_home", "nursing_home_icon.png");
		osmKeyValueImage.put("amenity", "pharmacy", "medicine.png");
		osmKeyValueImage.put("amenity", "social_facility", "sozialeeinrichtung.png");
		osmKeyValueImage.put("amenity", "veterinary", "veterinary.png");
		
		// Entertainment, Arts & Culture
		osmKeyValueImage.put("amenity", "arts_centre", "cablecar.png");
		osmKeyValueImage.put("amenity", "brothel", "cablecar.png");
		osmKeyValueImage.put("amenity", "casino", "cablecar.png");
		osmKeyValueImage.put("amenity", "cinema", "cablecar.png");
		osmKeyValueImage.put("amenity", "community_centre", "cablecar.png");
		osmKeyValueImage.put("amenity", "conference_centre", "cablecar.png");
		osmKeyValueImage.put("amenity", "events_venue", "cablecar.png");
		osmKeyValueImage.put("amenity", "exhibition_centre", "cablecar.png");
		osmKeyValueImage.put("amenity", "fountain", "cablecar.png");
		osmKeyValueImage.put("amenity", "gambling", "cablecar.png");
		osmKeyValueImage.put("amenity", "love_hotel", "cablecar.png");
		osmKeyValueImage.put("amenity", "music_venue", "cablecar.png");
		osmKeyValueImage.put("amenity", "nightclub", "cablecar.png");
		osmKeyValueImage.put("amenity", "planetarium", "cablecar.png");
		osmKeyValueImage.put("amenity", "public_bookcase", "cablecar.png");
		osmKeyValueImage.put("amenity", "social_centre", "cablecar.png");
		osmKeyValueImage.put("amenity", "stripclub", "cablecar.png");
		osmKeyValueImage.put("amenity", "studio", "cablecar.png");
		osmKeyValueImage.put("amenity", "swingerclub", "cablecar.png");
		osmKeyValueImage.put("amenity", "theatre", "cablecar.png");
		
		// Public Service
		osmKeyValueImage.put("amenity", "courthouse", "cablecar.png");
		osmKeyValueImage.put("amenity", "fire_station", "cablecar.png");
		osmKeyValueImage.put("amenity", "police", "cablecar.png");
		osmKeyValueImage.put("amenity", "post_box", "cablecar.png");	
		osmKeyValueImage.put("amenity", "post_depot", "cablecar.png");
		osmKeyValueImage.put("amenity", "post_office", "cablecar.png");
		osmKeyValueImage.put("amenity", "prison", "cablecar.png");
		osmKeyValueImage.put("amenity", "ranger_station", "cablecar.png");
		osmKeyValueImage.put("amenity", "townhall", "cablecar.png");
		
		// Facilities
		osmKeyValueImage.put("amenity", "bbq", "cablecar.png");
		osmKeyValueImage.put("amenity", "bench", "cablecar.png");
		osmKeyValueImage.put("amenity", "dog_toilet", "cablecar.png");
		osmKeyValueImage.put("amenity", "dressing_room", "cablecar.png");
		osmKeyValueImage.put("amenity", "drinking_water", "cablecar.png");
		osmKeyValueImage.put("amenity", "give_box", "cablecar.png");
		osmKeyValueImage.put("amenity", "mailroom", "cablecar.png");
		osmKeyValueImage.put("amenity", "parcel_locker", "cablecar.png");
		osmKeyValueImage.put("amenity", "shelter", "cablecar.png");
		osmKeyValueImage.put("amenity", "shower", "cablecar.png");
		osmKeyValueImage.put("amenity", "telephone", "cablecar.png");
		osmKeyValueImage.put("amenity", "toilets", "cablecar.png");
		osmKeyValueImage.put("amenity", "water_point", "cablecar.png");
		osmKeyValueImage.put("amenity", "watering_place", "cablecar.png");
		
		// Waste Management
		osmKeyValueImage.put("amenity", "sanitary_dump_station", "cablecar.png");
		osmKeyValueImage.put("amenity", "recycling", "cablecar.png");
		osmKeyValueImage.put("amenity", "waste_basket", "cablecar.png");
		osmKeyValueImage.put("amenity", "waste_disposal", "cablecar.png");
		osmKeyValueImage.put("amenity", "waste_transfer_station", "cablecar.png");
		
		// Others
		osmKeyValueImage.put("amenity", "animal_boarding", "cablecar.png");
		osmKeyValueImage.put("amenity", "animal_breeding", "cablecar.png");
		osmKeyValueImage.put("amenity", "animal_shelter", "cablecar.png");
		osmKeyValueImage.put("amenity", "animal_training", "cablecar.png");
		osmKeyValueImage.put("amenity", "baking_oven", "cablecar.png");
		osmKeyValueImage.put("amenity", "clock", "cablecar.png");
		osmKeyValueImage.put("amenity", "crematorium", "cablecar.png");
		osmKeyValueImage.put("amenity", "dive_centre", "cablecar.png");
		osmKeyValueImage.put("amenity", "funeral_hall", "cablecar.png");
		osmKeyValueImage.put("amenity", "grave_yard", "cablecar.png");
		osmKeyValueImage.put("amenity", "hunting_stand", "cablecar.png");
		osmKeyValueImage.put("amenity", "internet_cafe", "cablecar.png");
		osmKeyValueImage.put("amenity", "kitchen", "cablecar.png");
		osmKeyValueImage.put("amenity", "kneipp_water_cure", "cablecar.png");
		osmKeyValueImage.put("amenity", "lounger", "cablecar.png");
		osmKeyValueImage.put("amenity", "marketplace", "cablecar.png");
		osmKeyValueImage.put("amenity", "monastery", "cablecar.png");
		osmKeyValueImage.put("amenity", "photo_booth", "cablecar.png");
		osmKeyValueImage.put("amenity", "place_of_mourning", "cablecar.png");
		osmKeyValueImage.put("amenity", "place_of_worship", "cablecar.png");
		osmKeyValueImage.put("amenity", "public_bath", "cablecar.png");
		osmKeyValueImage.put("amenity", "refugee_site", "cablecar.png");
		osmKeyValueImage.put("amenity", "vending_machine", "cablecar.png");
		osmKeyValueImage.put("amenity", "user defined", "cablecar.png");
		
		// Barrier
		osmKeyValueImage.put("barrier", "cable_barrier", "cablecar.png");
		osmKeyValueImage.put("barrier", "city_wall", "cablecar.png");
		osmKeyValueImage.put("barrier", "ditch", "cablecar.png");
		osmKeyValueImage.put("barrier", "fence", "cablecar.png");
		osmKeyValueImage.put("barrier", "guard_rail", "cablecar.png");
		osmKeyValueImage.put("barrier", "handrail", "cablecar.png");
		osmKeyValueImage.put("barrier", "hedge", "cablecar.png");
		osmKeyValueImage.put("barrier", "kerb", "cablecar.png");
		osmKeyValueImage.put("barrier", "retaining_wall", "cablecar.png");
		osmKeyValueImage.put("barrier", "wall", "cablecar.png");
		
		// Access control on highways
		osmKeyValueImage.put("barrier", "block", "cablecar.png");
		osmKeyValueImage.put("barrier", "bollard", "cablecar.png");
		osmKeyValueImage.put("barrier", "border_control", "cablecar.png");
		osmKeyValueImage.put("barrier", "bump_gate", "cablecar.png");
		osmKeyValueImage.put("barrier", "bus_trap", "cablecar.png");
		osmKeyValueImage.put("barrier", "cattle_grid", "cablecar.png");
		osmKeyValueImage.put("barrier", "chain", "cablecar.png");
		osmKeyValueImage.put("barrier", "cycle_barrier", "cablecar.png");
		osmKeyValueImage.put("barrier", "debris", "cablecar.png");
		osmKeyValueImage.put("barrier", "entrance", "cablecar.png");
		osmKeyValueImage.put("barrier", "full-height_turnstile", "cablecar.png");
		osmKeyValueImage.put("barrier", "gate", "cablecar.png");
		osmKeyValueImage.put("barrier", "hampshire_gate", "cablecar.png");
		osmKeyValueImage.put("barrier", "height_restrictor", "cablecar.png");
		osmKeyValueImage.put("barrier", "horse_stile", "cablecar.png");
		osmKeyValueImage.put("barrier", "jersey_barrier", "cablecar.png");
		osmKeyValueImage.put("barrier", "kissing_gate", "cablecar.png");
		osmKeyValueImage.put("barrier", "lift_gate", "cablecar.png");
		osmKeyValueImage.put("barrier", "log", "cablecar.png");
		osmKeyValueImage.put("barrier", "motorcycle_barrier", "cablecar.png");
		osmKeyValueImage.put("barrier", "rope", "cablecar.png");
		osmKeyValueImage.put("barrier", "sally_port", "cablecar.png");
		osmKeyValueImage.put("barrier", "spikes", "cablecar.png");
		osmKeyValueImage.put("barrier", "stile", "cablecar.png");
		osmKeyValueImage.put("barrier", "sump_buster", "cablecar.png");
		osmKeyValueImage.put("barrier", "swing_gate", "cablecar.png");
		osmKeyValueImage.put("barrier", "toll_booth", "cablecar.png");
		osmKeyValueImage.put("barrier", "turnstile", "cablecar.png");
		osmKeyValueImage.put("barrier", "yes", "cablecar.png");
		
		// Boundary
		osmKeyValueImage.put("boundary", "aboriginal_lands", "cablecar.png");
		osmKeyValueImage.put("boundary", "administrative", "cablecar.png");
		osmKeyValueImage.put("boundary", "border_zone", "cablecar.png");
		osmKeyValueImage.put("boundary", "forest", "cablecar.png");
		osmKeyValueImage.put("boundary", "forest_compartment", "cablecar.png");
		osmKeyValueImage.put("boundary", "hazard", "cablecar.png");
		osmKeyValueImage.put("boundary", "maritime", "cablecar.png");
		osmKeyValueImage.put("boundary", "marker", "cablecar.png");
		osmKeyValueImage.put("boundary", "national_park", "cablecar.png");
		osmKeyValueImage.put("boundary", "place", "cablecar.png");
		osmKeyValueImage.put("boundary", "political", "cablecar.png");
		osmKeyValueImage.put("boundary", "postal_code", "cablecar.png");
		osmKeyValueImage.put("boundary", "protected_area", "cablecar.png");
		osmKeyValueImage.put("boundary", "special_economic_zone", "cablecar.png");
		osmKeyValueImage.put("boundary", "disputed", "cablecar.png");
		osmKeyValueImage.put("boundary", "user defined", "cablecar.png");
		
		// Building - Accommodation
		osmKeyValueImage.put("building", "apartments", "cablecar.png");
		osmKeyValueImage.put("building", "barracks", "cablecar.png");
		osmKeyValueImage.put("building", "bungalow", "cablecar.png");
		osmKeyValueImage.put("building", "cabin", "cablecar.png");
		osmKeyValueImage.put("building", "detached", "cablecar.png");
		osmKeyValueImage.put("building", "dormitory", "cablecar.png");
		osmKeyValueImage.put("building", "farm", "cablecar.png");
		osmKeyValueImage.put("building", "ger", "cablecar.png");
		osmKeyValueImage.put("building", "hotel", "cablecar.png");
		osmKeyValueImage.put("building", "house", "cablecar.png");
		osmKeyValueImage.put("building", "houseboat", "cablecar.png");
		osmKeyValueImage.put("building", "residential", "cablecar.png");
		osmKeyValueImage.put("building", "semidetached_house", "cablecar.png");
		osmKeyValueImage.put("building", "static_caravan", "cablecar.png");
		osmKeyValueImage.put("building", "stilt_house", "cablecar.png");
		osmKeyValueImage.put("building", "terrace", "cablecar.png");
		osmKeyValueImage.put("building", "tree_house", "cablecar.png");
		
		// Commercial
		osmKeyValueImage.put("building", "commercial", "cablecar.png");
		osmKeyValueImage.put("building", "industrial", "cablecar.png");
		osmKeyValueImage.put("building", "kiosk", "cablecar.png");
		osmKeyValueImage.put("building", "office", "cablecar.png");
		osmKeyValueImage.put("building", "retail", "cablecar.png");
		osmKeyValueImage.put("building", "supermarket", "cablecar.png");
		osmKeyValueImage.put("building", "warehouse", "cablecar.png");
		
		// Religious
		osmKeyValueImage.put("building", "cathedral", "cablecar.png");
		osmKeyValueImage.put("building", "chapel", "cablecar.png");
		osmKeyValueImage.put("building", "church", "cablecar.png");
		osmKeyValueImage.put("building", "kingdom_hall", "cablecar.png");
		osmKeyValueImage.put("building", "monastery", "cablecar.png");
		osmKeyValueImage.put("building", "mosque", "cablecar.png");
		osmKeyValueImage.put("building", "presbytery", "cablecar.png");
		osmKeyValueImage.put("building", "religious", "cablecar.png");
		osmKeyValueImage.put("building", "shrine", "cablecar.png");
		osmKeyValueImage.put("building", "synagogue", "cablecar.png");
		osmKeyValueImage.put("building", "temple", "cablecar.png");
		
		// Civic/amenity
		osmKeyValueImage.put("building", "bakehouse", "cablecar.png");
		osmKeyValueImage.put("building", "bridge", "cablecar.png");
		osmKeyValueImage.put("building", "civic", "cablecar.png");
		osmKeyValueImage.put("building", "college", "cablecar.png");
		osmKeyValueImage.put("building", "fire_station", "cablecar.png");
		osmKeyValueImage.put("building", "government", "cablecar.png");
		osmKeyValueImage.put("building", "gatehouse", "cablecar.png");
		osmKeyValueImage.put("building", "hospital", "cablecar.png");
		osmKeyValueImage.put("building", "kindergarten", "cablecar.png");
		osmKeyValueImage.put("building", "museum", "cablecar.png");
		osmKeyValueImage.put("building", "public", "cablecar.png");
		osmKeyValueImage.put("building", "school", "cablecar.png");
		osmKeyValueImage.put("building", "toilets", "cablecar.png");
		osmKeyValueImage.put("building", "train_station", "cablecar.png");
		osmKeyValueImage.put("building", "transportation", "cablecar.png");
		osmKeyValueImage.put("building", "university", "cablecar.png");
		
		// Agricultural/plant production
		osmKeyValueImage.put("building", "barn", "cablecar.png");
		osmKeyValueImage.put("building", "conservatory", "cablecar.png");
		osmKeyValueImage.put("building", "cowshed", "cablecar.png");
		osmKeyValueImage.put("building", "farm_auxiliary", "cablecar.png");
		osmKeyValueImage.put("building", "greenhouse", "cablecar.png");
		osmKeyValueImage.put("building", "slurry_tank", "cablecar.png");
		osmKeyValueImage.put("building", "stable", "cablecar.png");
		osmKeyValueImage.put("building", "sty", "cablecar.png");
		osmKeyValueImage.put("building", "livestock", "cablecar.png");
		
		// Sports
		osmKeyValueImage.put("building", "grandstand", "cablecar.png");
		osmKeyValueImage.put("building", "pavilion", "cablecar.png");
		osmKeyValueImage.put("building", "riding_hall", "cablecar.png");
		osmKeyValueImage.put("building", "sports_hall", "cablecar.png");
		osmKeyValueImage.put("building", "stadium", "cablecar.png");
		
		// Storage
		osmKeyValueImage.put("building", "hangar", "cablecar.png");
		osmKeyValueImage.put("building", "hut", "cablecar.png");
		osmKeyValueImage.put("building", "shed", "cablecar.png");
		
		// Cars
		osmKeyValueImage.put("building", "carport", "cablecar.png");
		osmKeyValueImage.put("building", "garage", "cablecar.png");
		osmKeyValueImage.put("building", "garages", "cablecar.png");
		osmKeyValueImage.put("building", "parking", "cablecar.png");
		
		// Power/technical buildings
		osmKeyValueImage.put("building", "digester", "cablecar.png");
		osmKeyValueImage.put("building", "service", "cablecar.png");
		osmKeyValueImage.put("building", "transformer_tower", "cablecar.png");
		osmKeyValueImage.put("building", "water_tower", "cablecar.png");
		osmKeyValueImage.put("building", "storage_tank", "cablecar.png");
		osmKeyValueImage.put("building", "silo", "cablecar.png");
		
		// Other buildings
		osmKeyValueImage.put("building", "beach_hut", "cablecar.png");
		osmKeyValueImage.put("building", "bunker", "cablecar.png");
		osmKeyValueImage.put("building", "castle", "cablecar.png");
		osmKeyValueImage.put("building", "construction", "cablecar.png");
		osmKeyValueImage.put("building", "container", "cablecar.png");
		osmKeyValueImage.put("building", "military", "cablecar.png");
		osmKeyValueImage.put("building", "roof", "cablecar.png");
		osmKeyValueImage.put("building", "ruins", "cablecar.png");
		osmKeyValueImage.put("building", "tent", "cablecar.png");
		osmKeyValueImage.put("building", "tower", "cablecar.png");
		osmKeyValueImage.put("building", "yes", "cablecar.png");
		osmKeyValueImage.put("building", "user defined", "cablecar.png");
		
		// Craft
		osmKeyValueImage.put("craft", "agricultural_engines", "cablecar.png");
		osmKeyValueImage.put("craft", "atelier", "cablecar.png");
		osmKeyValueImage.put("craft", "bakery", "cablecar.png");
		osmKeyValueImage.put("craft", "basket_maker", "cablecar.png");
		osmKeyValueImage.put("craft", "beekeeper", "cablecar.png");
		osmKeyValueImage.put("craft", "blacksmith", "cablecar.png");
		osmKeyValueImage.put("craft", "boatbuilder", "cablecar.png");
		osmKeyValueImage.put("craft", "bookbinder", "cablecar.png");
		osmKeyValueImage.put("craft", "brewery", "cablecar.png");
		osmKeyValueImage.put("craft", "builder", "cablecar.png");
		osmKeyValueImage.put("craft", "cabinet_maker", "cablecar.png");
		osmKeyValueImage.put("craft", "candlemaker", "cablecar.png");
		osmKeyValueImage.put("craft", "car_painter", "cablecar.png");
		osmKeyValueImage.put("craft", "carpenter", "cablecar.png");
		osmKeyValueImage.put("craft", "carpet_layer", "cablecar.png");
		osmKeyValueImage.put("craft", "caterer", "cablecar.png");
		osmKeyValueImage.put("craft", "chimney_sweeper", "cablecar.png");
		osmKeyValueImage.put("craft", "cleaning", "cablecar.png");
		osmKeyValueImage.put("craft", "clockmaker", "cablecar.png");
		osmKeyValueImage.put("craft", "confectionery", "cablecar.png");
		osmKeyValueImage.put("craft", "cooper", "cablecar.png");
		osmKeyValueImage.put("craft", "dental_technician", "cablecar.png");
		osmKeyValueImage.put("craft", "distillery", "cablecar.png");
		osmKeyValueImage.put("craft", "door_construction", "cablecar.png");
		osmKeyValueImage.put("craft", "dressmaker", "cablecar.png");
		osmKeyValueImage.put("craft", "electronics_repair", "cablecar.png");
		osmKeyValueImage.put("craft", "embroiderer", "cablecar.png");
		osmKeyValueImage.put("craft", "electrician", "cablecar.png");
		osmKeyValueImage.put("craft", "engraver", "cablecar.png");
		osmKeyValueImage.put("craft", "fence_maker", "cablecar.png");
		osmKeyValueImage.put("craft", "floorer", "cablecar.png");
		osmKeyValueImage.put("craft", "gardener", "cablecar.png");
		osmKeyValueImage.put("craft", "glaziery", "cablecar.png");
		osmKeyValueImage.put("craft", "goldsmith", "cablecar.png");
		osmKeyValueImage.put("craft", "grinding_mill", "cablecar.png");
		osmKeyValueImage.put("craft", "handicraft", "cablecar.png");
		osmKeyValueImage.put("craft", "hvac", "cablecar.png");
		osmKeyValueImage.put("craft", "insulation", "cablecar.png");
		osmKeyValueImage.put("craft", "interior_decorator", "cablecar.png");
		osmKeyValueImage.put("craft", "interior_work", "cablecar.png");
		osmKeyValueImage.put("craft", "jeweller", "cablecar.png");
		osmKeyValueImage.put("craft", "joiner", "cablecar.png");
		osmKeyValueImage.put("craft", "key_cutter", "cablecar.png");
		osmKeyValueImage.put("craft", "locksmith", "cablecar.png");
		osmKeyValueImage.put("craft", "metal_construction", "cablecar.png");
		osmKeyValueImage.put("craft", "mint", "cablecar.png");
		osmKeyValueImage.put("craft", "musical_instrument", "cablecar.png");
		osmKeyValueImage.put("craft", "oil_mill", "cablecar.png");
		osmKeyValueImage.put("craft", "optician", "cablecar.png");
		osmKeyValueImage.put("craft", "organ_builder", "cablecar.png");
		osmKeyValueImage.put("craft", "painter", "cablecar.png");
		osmKeyValueImage.put("craft", "parquet_layer", "cablecar.png");
		osmKeyValueImage.put("craft", "paver", "cablecar.png");
		osmKeyValueImage.put("craft", "pest_control", "cablecar.png");
		osmKeyValueImage.put("craft", "photographer", "cablecar.png");
		osmKeyValueImage.put("craft", "photographic_laboratory", "cablecar.png");
		osmKeyValueImage.put("craft", "piano_tuner", "cablecar.png");
		osmKeyValueImage.put("craft", "plasterer", "cablecar.png");
		osmKeyValueImage.put("craft", "plumber", "cablecar.png");
		osmKeyValueImage.put("craft", "pottery", "cablecar.png");
		osmKeyValueImage.put("craft", "printer", "cablecar.png");
		osmKeyValueImage.put("craft", "printmaker", "cablecar.png");
		osmKeyValueImage.put("craft", "restoration", "cablecar.png");
		osmKeyValueImage.put("craft", "rigger", "cablecar.png");
		osmKeyValueImage.put("craft", "roofer", "cablecar.png");
		osmKeyValueImage.put("craft", "saddler", "cablecar.png");
		osmKeyValueImage.put("craft", "sailmaker", "cablecar.png");
		osmKeyValueImage.put("craft", "sawmill", "cablecar.png");
		osmKeyValueImage.put("craft", "scaffolder", "cablecar.png");
		osmKeyValueImage.put("craft", "sculptor", "cablecar.png");
		osmKeyValueImage.put("craft", "shoemaker", "cablecar.png");
		osmKeyValueImage.put("craft", "signmaker", "cablecar.png");
		osmKeyValueImage.put("craft", "stand_builder", "cablecar.png");
		osmKeyValueImage.put("craft", "stonemason", "cablecar.png");
		osmKeyValueImage.put("craft", "stove_fitter", "cablecar.png");
		osmKeyValueImage.put("craft", "sun_protection", "cablecar.png");
		osmKeyValueImage.put("craft", "tailor", "cablecar.png");
		osmKeyValueImage.put("craft", "tiler", "cablecar.png");
		osmKeyValueImage.put("craft", "tinsmith", "cablecar.png");
		osmKeyValueImage.put("craft", "toolmaker", "cablecar.png");
		osmKeyValueImage.put("craft", "turner", "cablecar.png");
		osmKeyValueImage.put("craft", "upholsterer", "cablecar.png");
		osmKeyValueImage.put("craft", "watchmaker", "cablecar.png");
		osmKeyValueImage.put("craft", "water_well_drilling", "cablecar.png");
		osmKeyValueImage.put("craft", "window_construction", "cablecar.png");
		osmKeyValueImage.put("craft", "winery", "cablecar.png");
		
		// Emergency - Medical rescue
		osmKeyValueImage.put("emergency", "ambulance_station", "cablecar.png");
		osmKeyValueImage.put("emergency", "defibrillator", "cablecar.png");
		osmKeyValueImage.put("emergency", "landing_site", "cablecar.png");
		osmKeyValueImage.put("emergency", "emergency_ward_entrance", "cablecar.png");
		
		// Firefighters
		osmKeyValueImage.put("emergency", "fire_service_inlet", "cablecar.png");
		osmKeyValueImage.put("emergency", "fire_alarm_box", "cablecar.png");
		osmKeyValueImage.put("emergency", "fire_extinguisher", "cablecar.png");
		osmKeyValueImage.put("emergency", "fire_hose", "cablecar.png");
		osmKeyValueImage.put("emergency", "fire_hydrant", "cablecar.png");
		osmKeyValueImage.put("emergency", "water_tank", "cablecar.png");
		osmKeyValueImage.put("emergency", "suction_point", "cablecar.png");
		
		// Lifeguards
		osmKeyValueImage.put("emergency", "lifeguard", "cablecar.png");
		osmKeyValueImage.put("emergency", "life_ring", "cablecar.png");
		
		osmKeyValueImage.put("lifeguard", "tower", "cablecar.png");
		
		// Assembly point
		osmKeyValueImage.put("emergency", "assembly_point", "cablecar.png");
		
		// Other structure
		osmKeyValueImage.put("emergency", "phone", "cablecar.png");
		osmKeyValueImage.put("emergency", "siren", "cablecar.png");
		osmKeyValueImage.put("emergency", "drinking_water", "cablecar.png");
		
		// Geological
		osmKeyValueImage.put("geological", "moraine", "cablecar.png");
		osmKeyValueImage.put("geological", "outcrop", "cablecar.png");
		osmKeyValueImage.put("geological", "volcanic_caldera_rim", "cablecar.png");
		osmKeyValueImage.put("geological", "fault", "cablecar.png");
		osmKeyValueImage.put("geological", "palaeontological_site", "cablecar.png");
		osmKeyValueImage.put("geological", "volcanic_lava_field", "cablecar.png");
		osmKeyValueImage.put("geological", "volcanic_vent", "cablecar.png");
		osmKeyValueImage.put("geological", "glacial_erratic", "cablecar.png");
		osmKeyValueImage.put("geological", "rock_glacier", "cablecar.png");
		osmKeyValueImage.put("geological", "giants_kettle", "cablecar.png");
		osmKeyValueImage.put("geological", "meteor_crater", "cablecar.png");
		osmKeyValueImage.put("geological", "hoodoo", "cablecar.png");
		osmKeyValueImage.put("geological", "columnar_jointing", "cablecar.png");
		
		// TODO: Healthcare features
		
		// Highway
		osmKeyValueImage.put("highway", "motorway", "cablecar.png");
		osmKeyValueImage.put("highway", "trunk", "cablecar.png");
		osmKeyValueImage.put("highway", "primary", "cablecar.png");
		osmKeyValueImage.put("highway", "secondary", "cablecar.png");
		osmKeyValueImage.put("highway", "tertiary", "cablecar.png");
		osmKeyValueImage.put("highway", "unclassified", "cablecar.png");
		osmKeyValueImage.put("highway", "residential", "cablecar.png");
		
		// Link roads
		osmKeyValueImage.put("highway", "motorway_link", "cablecar.png");
		osmKeyValueImage.put("highway", "trunk_link", "cablecar.png");
		osmKeyValueImage.put("highway", "primary_link", "cablecar.png");
		osmKeyValueImage.put("highway", "secondary_link", "cablecar.png");
		osmKeyValueImage.put("highway", "tertiary_link", "cablecar.png");
		
		// Special road types
		osmKeyValueImage.put("highway", "living_street", "cablecar.png");
		osmKeyValueImage.put("highway", "service", "cablecar.png");
		osmKeyValueImage.put("highway", "pedestrian", "cablecar.png");
		osmKeyValueImage.put("highway", "track", "cablecar.png");
		osmKeyValueImage.put("highway", "bus_guideway", "cablecar.png");
		osmKeyValueImage.put("highway", "escape", "cablecar.png");
		osmKeyValueImage.put("highway", "raceway", "cablecar.png");
		osmKeyValueImage.put("highway", "road", "cablecar.png");
		osmKeyValueImage.put("highway", "busway", "cablecar.png");
		
		// Paths
		osmKeyValueImage.put("highway", "footway", "cablecar.png");
		osmKeyValueImage.put("highway", "bridleway", "cablecar.png");
		osmKeyValueImage.put("highway", "steps", "cablecar.png");
		osmKeyValueImage.put("highway", "corridor", "cablecar.png");
		osmKeyValueImage.put("highway", "path", "cablecar.png");
		osmKeyValueImage.put("highway", "via_ferrata", "cablecar.png");
		
		// When sidewalk/crosswalk is tagged as a separate way
		osmKeyValueImage.put("footway", "sidewalk", "cablecar.png");
		osmKeyValueImage.put("footway", "crossing", "cablecar.png");
		
		//When sidewalk (or pavement) is tagged on the main roadway
		osmKeyValueImage.put("sidewalk", "both", "cablecar.png");
		osmKeyValueImage.put("sidewalk", "left", "cablecar.png");
		osmKeyValueImage.put("sidewalk", "right", "cablecar.png");
		osmKeyValueImage.put("sidewalk", "no", "cablecar.png");
		
		// When cycleway is drawn as its own way
		osmKeyValueImage.put("highway", "cycleway", "cablecar.png");
		
		// Cycleway tagged on the main roadway or lane
		osmKeyValueImage.put("cycleway", "lane", "cablecar.png");
		osmKeyValueImage.put("cycleway", "opposite", "cablecar.png");
		osmKeyValueImage.put("cycleway", "opposite_lane", "cablecar.png");
		osmKeyValueImage.put("cycleway", "track", "cablecar.png");
		osmKeyValueImage.put("cycleway", "opposite_track", "cablecar.png");
		osmKeyValueImage.put("cycleway", "share_busway", "cablecar.png");
		osmKeyValueImage.put("cycleway", "opposite_share_busway", "cablecar.png");
		osmKeyValueImage.put("cycleway", "shared_lane", "cablecar.png");
		osmKeyValueImage.put("cycleway", "lane", "cablecar.png");
		
		// Lifecycle
		osmKeyValueImage.put("highway", "proposed", "cablecar.png");
		osmKeyValueImage.put("highway", "construction", "cablecar.png");
		
		// Other highway features
		osmKeyValueImage.put("highway", "bus_stop", "cablecar.png");
		osmKeyValueImage.put("highway", "crossing", "cablecar.png");
		osmKeyValueImage.put("highway", "elevator", "cablecar.png");
		osmKeyValueImage.put("highway", "emergency_bay", "cablecar.png");
		osmKeyValueImage.put("highway", "emergency_access_point", "cablecar.png");
		osmKeyValueImage.put("highway", "give_way", "cablecar.png");
		osmKeyValueImage.put("emergency", "phone", "cablecar.png");
		
		osmKeyValueImage.put("highway", "milestone", "cablecar.png");
		osmKeyValueImage.put("highway", "mini_roundabout", "cablecar.png");
		osmKeyValueImage.put("highway", "motorway_junction", "cablecar.png");
		osmKeyValueImage.put("highway", "passing_place", "cablecar.png");
		osmKeyValueImage.put("highway", "platform", "cablecar.png");
		osmKeyValueImage.put("highway", "rest_area", "cablecar.png");
		osmKeyValueImage.put("highway", "services", "cablecar.png");
		osmKeyValueImage.put("highway", "speed_camera", "cablecar.png");
		osmKeyValueImage.put("highway", "stop", "cablecar.png");
		osmKeyValueImage.put("highway", "street_lamp", "cablecar.png");
		osmKeyValueImage.put("highway", "toll_gantry", "cablecar.png");
		osmKeyValueImage.put("highway", "traffic_mirror", "cablecar.png");
		osmKeyValueImage.put("highway", "traffic_signals", "cablecar.png");
		osmKeyValueImage.put("highway", "trailhead", "cablecar.png");
		osmKeyValueImage.put("highway", "turning_circle", "cablecar.png");
		osmKeyValueImage.put("highway", "turning_loop", "cablecar.png");
		
		// Historic
		osmKeyValueImage.put("historic", "aircraft", "cablecar.png");
		osmKeyValueImage.put("historic", "anchor", "cablecar.png");
		osmKeyValueImage.put("historic", "aqueduct", "cablecar.png");
		osmKeyValueImage.put("historic", "archaeological_site", "cablecar.png");
		osmKeyValueImage.put("historic", "battlefield", "cablecar.png");
		osmKeyValueImage.put("historic", "bomb_crater", "cablecar.png");
		osmKeyValueImage.put("historic", "boundary_stone", "cablecar.png");
		osmKeyValueImage.put("historic", "building", "cablecar.png");
		osmKeyValueImage.put("historic", "cannon", "cablecar.png");
		osmKeyValueImage.put("historic", "castle", "cablecar.png");
		osmKeyValueImage.put("historic", "castle_wall", "cablecar.png");
		osmKeyValueImage.put("historic", "cattle_crush", "cablecar.png");
		osmKeyValueImage.put("historic", "charcoal_pile", "cablecar.png");
		osmKeyValueImage.put("historic", "church", "cablecar.png");
		osmKeyValueImage.put("historic", "city_gate", "cablecar.png");
		osmKeyValueImage.put("historic", "citywalls", "cablecar.png");
		osmKeyValueImage.put("historic", "creamery", "cablecar.png");
		osmKeyValueImage.put("historic", "district", "cablecar.png");
		osmKeyValueImage.put("historic", "farm", "cablecar.png");
		osmKeyValueImage.put("historic", "fort", "cablecar.png");
		osmKeyValueImage.put("historic", "gallows", "cablecar.png");
		osmKeyValueImage.put("historic", "house", "cablecar.png");
		osmKeyValueImage.put("historic", "highwater_mark", "cablecar.png");
		osmKeyValueImage.put("historic", "locomotive", "cablecar.png");
		osmKeyValueImage.put("historic", "manor", "cablecar.png");
		osmKeyValueImage.put("historic", "memorial", "cablecar.png");
		osmKeyValueImage.put("historic", "milestone", "cablecar.png");
		osmKeyValueImage.put("historic", "monastery", "cablecar.png");
		osmKeyValueImage.put("historic", "monument", "cablecar.png");
		osmKeyValueImage.put("historic", "mosque", "cablecar.png");
		osmKeyValueImage.put("historic", "ogham_stone", "cablecar.png");
		osmKeyValueImage.put("historic", "optical_telegraph", "cablecar.png");
		osmKeyValueImage.put("historic", "pillory", "cablecar.png");
		osmKeyValueImage.put("historic", "railway_car", "cablecar.png");
		osmKeyValueImage.put("historic", "road", "cablecar.png");
		osmKeyValueImage.put("historic", "ruins", "cablecar.png");
		osmKeyValueImage.put("historic", "rune_stone", "cablecar.png");
		osmKeyValueImage.put("historic", "shieling", "cablecar.png");
		osmKeyValueImage.put("historic", "ship", "cablecar.png");
		osmKeyValueImage.put("historic", "stone", "cablecar.png");
		osmKeyValueImage.put("historic", "tank", "cablecar.png");
		osmKeyValueImage.put("historic", "temple", "cablecar.png");
		osmKeyValueImage.put("historic", "tomb", "cablecar.png");
		osmKeyValueImage.put("historic", "tower", "cablecar.png");
		osmKeyValueImage.put("historic", "vehicle", "cablecar.png");
		osmKeyValueImage.put("historic", "wayside_cross", "cablecar.png");
		osmKeyValueImage.put("historic", "wayside_shrine", "cablecar.png");
		osmKeyValueImage.put("historic", "wreck", "cablecar.png");
		osmKeyValueImage.put("historic", "yes", "cablecar.png");
		
		// Landuse - Common landuse key values - developed land
		osmKeyValueImage.put("landuse", "commercial", "cablecar.png");
		osmKeyValueImage.put("landuse", "construction", "cablecar.png");
		osmKeyValueImage.put("landuse", "education", "cablecar.png");
		osmKeyValueImage.put("landuse", "fairground", "cablecar.png");
		osmKeyValueImage.put("landuse", "industrial", "cablecar.png");
		osmKeyValueImage.put("landuse", "residential", "cablecar.png");
		osmKeyValueImage.put("landuse", "retail", "cablecar.png");
		osmKeyValueImage.put("landuse", "institutional", "cablecar.png");
		
		// Common landuse key values - rural and agricultural land		
		osmKeyValueImage.put("landuse", "aquaculture", "cablecar.png");
		osmKeyValueImage.put("landuse", "allotments", "cablecar.png");
		osmKeyValueImage.put("landuse", "farmland", "cablecar.png");
		osmKeyValueImage.put("landuse", "farmyard", "cablecar.png");
		osmKeyValueImage.put("landuse", "paddy", "cablecar.png");
		osmKeyValueImage.put("landuse", "animal_keeping", "cablecar.png");
		osmKeyValueImage.put("landuse", "flowerbed", "cablecar.png");
		osmKeyValueImage.put("landuse", "forest", "cablecar.png");
		osmKeyValueImage.put("landuse", "greenhouse_horticulture", "cablecar.png");
		osmKeyValueImage.put("landuse", "meadow", "cablecar.png");
		osmKeyValueImage.put("landuse", "orchard", "cablecar.png");
		osmKeyValueImage.put("landuse", "plant_nursery", "cablecar.png");
		osmKeyValueImage.put("landuse", "vineyard", "cablecar.png");
		
		// Common landuse key values - waterbody
		osmKeyValueImage.put("landuse", "basin", "cablecar.png");
		osmKeyValueImage.put("landuse", "salt_pond", "cablecar.png");
		
		// Other landuse key values
		osmKeyValueImage.put("landuse", "brownfield", "cablecar.png");
		osmKeyValueImage.put("landuse", "cemetery", "cablecar.png");
		osmKeyValueImage.put("landuse", "depot", "cablecar.png");
		osmKeyValueImage.put("landuse", "garages", "cablecar.png");
		osmKeyValueImage.put("landuse", "grass", "cablecar.png");
		osmKeyValueImage.put("landuse", "greenfield", "cablecar.png");
		osmKeyValueImage.put("landuse", "landfill", "cablecar.png");
		osmKeyValueImage.put("landuse", "military", "cablecar.png");
		osmKeyValueImage.put("landuse", "port", "cablecar.png");
		osmKeyValueImage.put("landuse", "quarry", "cablecar.png");
		osmKeyValueImage.put("landuse", "railway", "cablecar.png");
		osmKeyValueImage.put("landuse", "recreation_ground", "cablecar.png");
		osmKeyValueImage.put("landuse", "religious", "cablecar.png");
		osmKeyValueImage.put("landuse", "village_green", "cablecar.png");
		osmKeyValueImage.put("landuse", "winter_sports", "cablecar.png");
		
		// Leisure
		osmKeyValueImage.put("leisure", "adult_gaming_centre", "cablecar.png");
		osmKeyValueImage.put("leisure", "amusement_arcade", "cablecar.png");
		osmKeyValueImage.put("leisure", "beach_resort", "cablecar.png");
		osmKeyValueImage.put("leisure", "bandstand", "cablecar.png");
		osmKeyValueImage.put("leisure", "bird_hide", "cablecar.png");
		osmKeyValueImage.put("leisure", "common", "cablecar.png");
		osmKeyValueImage.put("leisure", "dance", "cablecar.png");
		osmKeyValueImage.put("leisure", "disc_golf_course", "cablecar.png");
		osmKeyValueImage.put("leisure", "dog_park", "cablecar.png");
		osmKeyValueImage.put("leisure", "escape_game", "cablecar.png");
		osmKeyValueImage.put("leisure", "firepit", "cablecar.png");
		osmKeyValueImage.put("leisure", "fishing", "cablecar.png");
		osmKeyValueImage.put("leisure", "fitness_centre", "cablecar.png");
		osmKeyValueImage.put("leisure", "fitness_station", "cablecar.png");
		osmKeyValueImage.put("leisure", "garden", "cablecar.png");
		osmKeyValueImage.put("leisure", "hackerspace", "cablecar.png");
		osmKeyValueImage.put("leisure", "horse_riding", "cablecar.png");
		osmKeyValueImage.put("leisure", "ice_rink", "cablecar.png");
		osmKeyValueImage.put("leisure", "marina", "cablecar.png");
		osmKeyValueImage.put("leisure", "miniature_golf", "cablecar.png");
		osmKeyValueImage.put("leisure", "nature_reserve", "cablecar.png");
		osmKeyValueImage.put("leisure", "park", "cablecar.png");
		osmKeyValueImage.put("leisure", "picnic_table", "cablecar.png");
		osmKeyValueImage.put("leisure", "pitch", "cablecar.png");
		osmKeyValueImage.put("leisure", "playground", "cablecar.png");
		osmKeyValueImage.put("leisure", "slipway", "cablecar.png");
		osmKeyValueImage.put("leisure", "sports_centre", "cablecar.png");
		osmKeyValueImage.put("leisure", "stadium", "cablecar.png");
		osmKeyValueImage.put("leisure", "summer_camp", "cablecar.png");
		osmKeyValueImage.put("leisure", "swimming_area", "cablecar.png");
		osmKeyValueImage.put("leisure", "swimming_pool", "cablecar.png");
		osmKeyValueImage.put("leisure", "track", "cablecar.png");
		osmKeyValueImage.put("leisure", "water_park", "cablecar.png");
		
		// Man made
		osmKeyValueImage.put("man_made", "adit", "cablecar.png");
		osmKeyValueImage.put("man_made", "beacon", "cablecar.png");
		osmKeyValueImage.put("man_made", "breakwater", "cablecar.png");
		osmKeyValueImage.put("man_made", "bridge", "cablecar.png");
		osmKeyValueImage.put("man_made", "bunker_silo", "cablecar.png");
		osmKeyValueImage.put("man_made", "carpet_hanger", "cablecar.png");
		osmKeyValueImage.put("man_made", "chimney", "cablecar.png");
		osmKeyValueImage.put("man_made", "column", "cablecar.png");
		osmKeyValueImage.put("man_made", "communications_tower", "cablecar.png");
		osmKeyValueImage.put("man_made", "crane", "cablecar.png");
		osmKeyValueImage.put("man_made", "cross", "cablecar.png");
		osmKeyValueImage.put("man_made", "cutline", "cablecar.png");
		osmKeyValueImage.put("man_made", "clearcut", "cablecar.png");
		osmKeyValueImage.put("man_made", "dovecote", "cablecar.png");
		osmKeyValueImage.put("man_made", "dyke", "cablecar.png");
		osmKeyValueImage.put("man_made", "embankment", "cablecar.png");
		osmKeyValueImage.put("man_made", "flagpole", "cablecar.png");
		osmKeyValueImage.put("man_made", "gasometer", "cablecar.png");
		osmKeyValueImage.put("man_made", "goods_conveyor", "cablecar.png");
		osmKeyValueImage.put("man_made", "groyne", "cablecar.png");
		osmKeyValueImage.put("man_made", "guard_stone", "cablecar.png");
		osmKeyValueImage.put("man_made", "kiln", "cablecar.png");
		osmKeyValueImage.put("man_made", "lighthouse", "cablecar.png");
		osmKeyValueImage.put("man_made", "mast", "cablecar.png");
		osmKeyValueImage.put("man_made", "mineshaft", "cablecar.png");
		osmKeyValueImage.put("man_made", "monitoring_station", "cablecar.png");
		osmKeyValueImage.put("man_made", "obelisk", "cablecar.png");
		osmKeyValueImage.put("man_made", "observatory", "cablecar.png");
		osmKeyValueImage.put("man_made", "offshore_platform", "cablecar.png");
		osmKeyValueImage.put("man_made", "petroleum_well", "cablecar.png");
		osmKeyValueImage.put("man_made", "pier", "cablecar.png");
		osmKeyValueImage.put("man_made", "pipeline", "cablecar.png");
		osmKeyValueImage.put("man_made", "pump", "cablecar.png");
		osmKeyValueImage.put("man_made", "pumping_station", "cablecar.png");
		osmKeyValueImage.put("man_made", "reservoir_covered", "cablecar.png");
		osmKeyValueImage.put("man_made", "silo", "cablecar.png");
		osmKeyValueImage.put("man_made", "snow_fence", "cablecar.png");
		osmKeyValueImage.put("man_made", "snow_net", "cablecar.png");
		osmKeyValueImage.put("man_made", "storage_tank", "cablecar.png");
		osmKeyValueImage.put("man_made", "street_cabinet", "cablecar.png");
		osmKeyValueImage.put("man_made", "stupa", "cablecar.png");
		osmKeyValueImage.put("man_made", "surveillance", "cablecar.png");
		osmKeyValueImage.put("man_made", "survey_point", "cablecar.png");
		osmKeyValueImage.put("man_made", "tailings_pond", "cablecar.png");
		osmKeyValueImage.put("man_made", "telescope", "cablecar.png");
		osmKeyValueImage.put("man_made", "tower", "cablecar.png");
		osmKeyValueImage.put("man_made", "video_wall", "cablecar.png");
		osmKeyValueImage.put("man_made", "wastewater_plant", "cablecar.png");
		osmKeyValueImage.put("man_made", "watermill", "cablecar.png");
		osmKeyValueImage.put("man_made", "water_tower", "cablecar.png");
		osmKeyValueImage.put("man_made", "water_well", "cablecar.png");
		osmKeyValueImage.put("man_made", "water_tap", "cablecar.png");
		osmKeyValueImage.put("man_made", "water_works", "cablecar.png");
		osmKeyValueImage.put("man_made", "wildlife_crossing", "cablecar.png");
		osmKeyValueImage.put("man_made", "windmill", "cablecar.png");
		osmKeyValueImage.put("man_made", "works", "cablecar.png");
		osmKeyValueImage.put("man_made", "yes", "cablecar.png");
		
		// Military
		osmKeyValueImage.put("military", "academy", "cablecar.png");
		osmKeyValueImage.put("military", "airfield", "cablecar.png");
		osmKeyValueImage.put("military", "base", "cablecar.png");
		osmKeyValueImage.put("military", "bunker", "cablecar.png");
		osmKeyValueImage.put("military", "barracks", "cablecar.png");
		osmKeyValueImage.put("military", "checkpoint", "cablecar.png");
		osmKeyValueImage.put("military", "danger_area", "cablecar.png");
		osmKeyValueImage.put("military", "nuclear_explosion_site", "cablecar.png");
		osmKeyValueImage.put("military", "obstacle_course", "cablecar.png");
		osmKeyValueImage.put("military", "office", "cablecar.png");
		osmKeyValueImage.put("military", "range", "cablecar.png");
		osmKeyValueImage.put("military", "school", "cablecar.png");
		osmKeyValueImage.put("military", "training_area", "cablecar.png");
		osmKeyValueImage.put("military", "trench", "cablecar.png");
		
		// Natural
		osmKeyValueImage.put("natural", "fell", "cablecar.png");
		osmKeyValueImage.put("natural", "grassland", "cablecar.png");
		osmKeyValueImage.put("natural", "heath", "cablecar.png");
		osmKeyValueImage.put("natural", "moor", "cablecar.png");
		osmKeyValueImage.put("natural", "scrub", "cablecar.png");
		osmKeyValueImage.put("natural", "shrubbery", "cablecar.png");
		osmKeyValueImage.put("natural", "tree", "cablecar.png");
		osmKeyValueImage.put("natural", "tree_row", "cablecar.png");
		osmKeyValueImage.put("natural", "tundra", "cablecar.png");
		osmKeyValueImage.put("natural", "wood", "cablecar.png");
		
		// Water related
		osmKeyValueImage.put("natural", "bay", "cablecar.png");
		osmKeyValueImage.put("natural", "beach", "cablecar.png");
		osmKeyValueImage.put("natural", "blowhole", "cablecar.png");
		osmKeyValueImage.put("natural", "cape", "cablecar.png");
		osmKeyValueImage.put("natural", "coastline", "cablecar.png");
		osmKeyValueImage.put("natural", "crevasse", "cablecar.png");
		osmKeyValueImage.put("natural", "geyser", "cablecar.png");
		osmKeyValueImage.put("natural", "glacier", "cablecar.png");
		osmKeyValueImage.put("natural", "hot_spring", "cablecar.png");
		osmKeyValueImage.put("natural", "isthmus", "cablecar.png");
		osmKeyValueImage.put("natural", "mud", "cablecar.png");
		osmKeyValueImage.put("natural", "peninsula", "cablecar.png");
		osmKeyValueImage.put("natural", "reef", "cablecar.png");
		osmKeyValueImage.put("natural", "shingle", "cablecar.png");
		osmKeyValueImage.put("natural", "shoal", "cablecar.png");
		osmKeyValueImage.put("natural", "spring", "cablecar.png");
		osmKeyValueImage.put("natural", "strait", "cablecar.png");
		osmKeyValueImage.put("natural", "water", "cablecar.png");
		osmKeyValueImage.put("natural", "wetland", "cablecar.png");
		
		// Geology related
		osmKeyValueImage.put("natural", "arch", "cablecar.png");
		osmKeyValueImage.put("natural", "arete", "cablecar.png");
		osmKeyValueImage.put("natural", "bare_rock", "cablecar.png");
		osmKeyValueImage.put("natural", "blockfield", "cablecar.png");
		osmKeyValueImage.put("natural", "cave_entrance", "cablecar.png");
		osmKeyValueImage.put("natural", "cliff", "cablecar.png");
		osmKeyValueImage.put("natural", "dune", "cablecar.png");
		osmKeyValueImage.put("natural", "earth_bank", "cablecar.png");
		osmKeyValueImage.put("natural", "fumarole", "cablecar.png");
		osmKeyValueImage.put("natural", "hill", "cablecar.png");
		osmKeyValueImage.put("natural", "peak", "cablecar.png");
		osmKeyValueImage.put("natural", "ridge", "cablecar.png");
		osmKeyValueImage.put("natural", "rock", "cablecar.png");
		osmKeyValueImage.put("natural", "saddle", "cablecar.png");
		osmKeyValueImage.put("natural", "sand", "cablecar.png");
		osmKeyValueImage.put("natural", "scree", "cablecar.png");
		osmKeyValueImage.put("natural", "sinkhole", "cablecar.png");
		osmKeyValueImage.put("natural", "stone", "cablecar.png");
		osmKeyValueImage.put("natural", "valley", "cablecar.png");
		osmKeyValueImage.put("natural", "volcano", "cablecar.png");
		
		// Office
		osmKeyValueImage.put("office", "accountant", "cablecar.png");
		osmKeyValueImage.put("office", "administrative", "cablecar.png");
		osmKeyValueImage.put("office", "advertising_agency", "cablecar.png");
		osmKeyValueImage.put("office", "architect", "cablecar.png");
		osmKeyValueImage.put("office", "association", "cablecar.png");
		osmKeyValueImage.put("office", "chamber", "cablecar.png");
		osmKeyValueImage.put("office", "charity", "cablecar.png");
		osmKeyValueImage.put("office", "company", "cablecar.png");
		osmKeyValueImage.put("office", "construction_company", "cablecar.png");
		osmKeyValueImage.put("office", "consulting", "cablecar.png");
		osmKeyValueImage.put("office", "courier", "cablecar.png");
		osmKeyValueImage.put("office", "coworking", "cablecar.png");
		osmKeyValueImage.put("office", "diplomatic", "cablecar.png");
		osmKeyValueImage.put("office", "educational_institution", "cablecar.png");
		osmKeyValueImage.put("office", "employment_agency", "cablecar.png");
		osmKeyValueImage.put("office", "energy_supplier", "cablecar.png");
		osmKeyValueImage.put("office", "engineer", "cablecar.png");
		osmKeyValueImage.put("office", "estate_agent", "cablecar.png");
		osmKeyValueImage.put("office", "financial", "cablecar.png");
		osmKeyValueImage.put("office", "financial_advisor", "cablecar.png");
		osmKeyValueImage.put("office", "forestry", "cablecar.png");
		osmKeyValueImage.put("office", "foundation", "cablecar.png");
		osmKeyValueImage.put("office", "geodesist", "cablecar.png");
		osmKeyValueImage.put("office", "graphic_design", "cablecar.png");
		osmKeyValueImage.put("office", "guide", "cablecar.png");
		osmKeyValueImage.put("office", "harbour_master", "cablecar.png");
		osmKeyValueImage.put("office", "insurance", "cablecar.png");
		osmKeyValueImage.put("office", "it", "cablecar.png");
		osmKeyValueImage.put("office", "lawyer", "cablecar.png");
		osmKeyValueImage.put("office", "logistics", "cablecar.png");
		osmKeyValueImage.put("office", "moving_company", "cablecar.png");
		osmKeyValueImage.put("office", "newspaper", "cablecar.png");
		osmKeyValueImage.put("office", "ngo", "cablecar.png");
		osmKeyValueImage.put("office", "notary", "cablecar.png");
		osmKeyValueImage.put("office", "politician", "cablecar.png");
		osmKeyValueImage.put("office", "political_party", "cablecar.png");
		osmKeyValueImage.put("office", "property_management", "cablecar.png");
		osmKeyValueImage.put("office", "publisher", "cablecar.png");
		osmKeyValueImage.put("office", "quango", "cablecar.png");
		osmKeyValueImage.put("office", "religion", "cablecar.png");
		osmKeyValueImage.put("office", "research", "cablecar.png");
		osmKeyValueImage.put("office", "security", "cablecar.png");
		osmKeyValueImage.put("office", "surveyor", "cablecar.png");
		osmKeyValueImage.put("office", "tax_advisor", "cablecar.png");
		osmKeyValueImage.put("office", "telecommunication", "cablecar.png");
		osmKeyValueImage.put("office", "therapist", "cablecar.png");
		osmKeyValueImage.put("office", "travel_agent", "cablecar.png");
		osmKeyValueImage.put("office", "tutoring", "cablecar.png");
		osmKeyValueImage.put("office", "union", "cablecar.png");
		osmKeyValueImage.put("office", "visa", "cablecar.png");
		osmKeyValueImage.put("office", "water_utility", "cablecar.png");
		osmKeyValueImage.put("office", "yes", "cablecar.png");
		
		// Place - Administratively declared places
		osmKeyValueImage.put("place", "country", "cablecar.png");
		osmKeyValueImage.put("place", "state", "cablecar.png");
		osmKeyValueImage.put("place", "region", "cablecar.png");
		osmKeyValueImage.put("place", "province", "cablecar.png");
		osmKeyValueImage.put("place", "district", "cablecar.png");
		osmKeyValueImage.put("place", "county", "cablecar.png");
		osmKeyValueImage.put("place", "municipality", "cablecar.png");
		
		// Populated settlements, urban
		osmKeyValueImage.put("place", "city", "cablecar.png");
		osmKeyValueImage.put("place", "borough", "cablecar.png");
		osmKeyValueImage.put("place", "suburb", "cablecar.png");
		osmKeyValueImage.put("place", "quarter", "cablecar.png");
		osmKeyValueImage.put("place", "neighbourhood", "cablecar.png");
		osmKeyValueImage.put("place", "city_block", "cablecar.png");
		osmKeyValueImage.put("place", "plot", "cablecar.png");
		
		// Populated settlements, urban and rural
		osmKeyValueImage.put("place", "town", "cablecar.png");
		osmKeyValueImage.put("place", "village", "cablecar.png");
		osmKeyValueImage.put("place", "hamlet", "cablecar.png");
		osmKeyValueImage.put("place", "isolated_dwelling", "cablecar.png");
		osmKeyValueImage.put("place", "farm", "cablecar.png");
		osmKeyValueImage.put("place", "allotments", "cablecar.png");
		
		// Other places
		osmKeyValueImage.put("place", "continent", "cablecar.png");
		osmKeyValueImage.put("place", "archipelago", "cablecar.png");
		osmKeyValueImage.put("place", "island", "cablecar.png");
		osmKeyValueImage.put("place", "islet", "cablecar.png");
		osmKeyValueImage.put("place", "square", "cablecar.png");
		osmKeyValueImage.put("place", "locality", "cablecar.png");
		osmKeyValueImage.put("place", "polder", "cablecar.png");
		osmKeyValueImage.put("place", "sea", "cablecar.png");
		osmKeyValueImage.put("place", "ocean", "cablecar.png");

		// Power
		osmKeyValueImage.put("power", "cable", "cablecar.png");
		osmKeyValueImage.put("power", "catenary_mast", "cablecar.png");
		osmKeyValueImage.put("power", "compensator", "cablecar.png");
		osmKeyValueImage.put("power", "connection", "cablecar.png");
		osmKeyValueImage.put("power", "converter", "cablecar.png");
		osmKeyValueImage.put("power", "generator", "cablecar.png");
		osmKeyValueImage.put("power", "heliostat", "cablecar.png");
		osmKeyValueImage.put("power", "insulator", "cablecar.png");
		osmKeyValueImage.put("power", "line", "cablecar.png");
		osmKeyValueImage.put("power", "busbar", "cablecar.png");
		osmKeyValueImage.put("power", "bay", "cablecar.png");
		osmKeyValueImage.put("power", "minor_line", "cablecar.png");
		osmKeyValueImage.put("power", "plant", "cablecar.png");
		osmKeyValueImage.put("power", "pole", "cablecar.png");
		osmKeyValueImage.put("power", "portal", "cablecar.png");
		osmKeyValueImage.put("power", "substation", "cablecar.png");
		osmKeyValueImage.put("power", "switch", "cablecar.png");
		osmKeyValueImage.put("power", "switchgear", "cablecar.png");
		osmKeyValueImage.put("power", "terminal", "cablecar.png");
		osmKeyValueImage.put("power", "tower", "cablecar.png");
		osmKeyValueImage.put("power", "transformer", "cablecar.png");
		
		// Public transport
		osmKeyValueImage.put("public_transport", "stop_position", "cablecar.png");
		osmKeyValueImage.put("public_transport", "platform", "cablecar.png");
		osmKeyValueImage.put("public_transport", "station", "cablecar.png");
		osmKeyValueImage.put("public_transport", "stop_area", "cablecar.png");
		osmKeyValueImage.put("public_transport", "stop_area_group", "cablecar.png");
		
		// Railway
		osmKeyValueImage.put("railway", "abandoned", "cablecar.png");
		osmKeyValueImage.put("railway", "construction", "cablecar.png");
		osmKeyValueImage.put("railway", "disused", "cablecar.png");
		osmKeyValueImage.put("railway", "funicular", "cablecar.png");
		osmKeyValueImage.put("railway", "light_rail", "cablecar.png");
		osmKeyValueImage.put("railway", "miniature", "cablecar.png");
		osmKeyValueImage.put("railway", "monorail", "cablecar.png");
		osmKeyValueImage.put("railway", "narrow_gauge", "cablecar.png");
		osmKeyValueImage.put("railway", "rail", "cablecar.png");
		osmKeyValueImage.put("railway", "subway", "cablecar.png");
		osmKeyValueImage.put("railway", "tram", "cablecar.png");
		
		// Additional track features or attributes
		osmKeyValueImage.put("bridge", "yes", "cablecar.png");
		osmKeyValueImage.put("cutting", "yes", "cablecar.png");
		osmKeyValueImage.put("electrified", "contact_line", "cablecar.png");
		osmKeyValueImage.put("electrified", "rail", "cablecar.png");
		osmKeyValueImage.put("electrified", "yes", "cablecar.png");
		osmKeyValueImage.put("electrified", "no", "cablecar.png");
		osmKeyValueImage.put("embankment", "yes", "cablecar.png");
		osmKeyValueImage.put("embedded_rails", "yes", "cablecar.png");
		osmKeyValueImage.put("frequency", "[number]", "cablecar.png");
		osmKeyValueImage.put("railway:track_ref", "[number]", "cablecar.png");
		osmKeyValueImage.put("service", "crossover", "cablecar.png");
		osmKeyValueImage.put("service", "siding", "cablecar.png");
		osmKeyValueImage.put("service", "spur", "cablecar.png");
		osmKeyValueImage.put("service", "yard", "cablecar.png");
		osmKeyValueImage.put("tunnel", "yes", "cablecar.png");
		osmKeyValueImage.put("tracks", "[number]", "cablecar.png");
		osmKeyValueImage.put("usage", "main", "cablecar.png");
		osmKeyValueImage.put("usage", "branch", "cablecar.png");
		osmKeyValueImage.put("usage", "industrial", "cablecar.png");
		osmKeyValueImage.put("usage", "military", "cablecar.png");
		osmKeyValueImage.put("usage", "tourism", "cablecar.png");
		osmKeyValueImage.put("usage", "scientific", "cablecar.png");
		osmKeyValueImage.put("usage", "test", "cablecar.png");
		osmKeyValueImage.put("voltage", "[number]", "cablecar.png");
		
		// Stations and stops
		osmKeyValueImage.put("railway", "halt", "cablecar.png");
		osmKeyValueImage.put("public_transport", "stop_position", "cablecar.png");
		osmKeyValueImage.put("public_transport", "platform", "cablecar.png");
		osmKeyValueImage.put("railway", "platform", "cablecar.png");
		osmKeyValueImage.put("public_transport", "station", "cablecar.png");
		osmKeyValueImage.put("railway", "station", "cablecar.png");
		osmKeyValueImage.put("railway", "subway_entrance", "cablecar.png");
		osmKeyValueImage.put("railway", "tram_stop", "cablecar.png");
		
		// Other railways
		osmKeyValueImage.put("railway", "buffer_stop", "cablecar.png");
		osmKeyValueImage.put("railway", "derail", "cablecar.png");
		osmKeyValueImage.put("railway", "crossing", "cablecar.png");
		osmKeyValueImage.put("railway", "level_crossing", "cablecar.png");
		osmKeyValueImage.put("railway", "tram_level_crossing", "cablecar.png");
		osmKeyValueImage.put("railway", "signal", "cablecar.png");
		osmKeyValueImage.put("railway", "switch", "cablecar.png");
		osmKeyValueImage.put("railway", "railway_crossing", "cablecar.png");
		osmKeyValueImage.put("landuse", "railway", "cablecar.png");
		osmKeyValueImage.put("railway", "turntable", "cablecar.png");
		osmKeyValueImage.put("railway", "roundhouse", "cablecar.png");
		osmKeyValueImage.put("railway", "traverser", "cablecar.png");
		osmKeyValueImage.put("railway", "wash", "cablecar.png");
		osmKeyValueImage.put("railway", "water_crane", "cablecar.png");
		osmKeyValueImage.put("railway", "ventilation_shaft", "cablecar.png");
		
		// Route
		osmKeyValueImage.put("route", "bicycle", "cablecar.png");
		osmKeyValueImage.put("route", "bus", "cablecar.png");
		osmKeyValueImage.put("route", "canoe", "cablecar.png");
		osmKeyValueImage.put("route", "detour", "cablecar.png");
		osmKeyValueImage.put("route", "ferry", "cablecar.png");
		osmKeyValueImage.put("route", "foot", "cablecar.png");
		osmKeyValueImage.put("route", "hiking", "cablecar.png");
		osmKeyValueImage.put("route", "horse", "cablecar.png");
		osmKeyValueImage.put("route", "inline_skates", "cablecar.png");
		osmKeyValueImage.put("route", "light_rail", "cablecar.png");
		osmKeyValueImage.put("route", "mtb", "cablecar.png");
		osmKeyValueImage.put("route", "piste", "cablecar.png");
		osmKeyValueImage.put("route", "railway", "cablecar.png");
		osmKeyValueImage.put("route", "road", "cablecar.png");
		osmKeyValueImage.put("route", "running", "cablecar.png");
		osmKeyValueImage.put("route", "ski", "cablecar.png");
		osmKeyValueImage.put("route", "subway", "cablecar.png");
		osmKeyValueImage.put("route", "train", "cablecar.png");
		osmKeyValueImage.put("route", "tracks", "cablecar.png");
		osmKeyValueImage.put("route", "tram", "cablecar.png");
		osmKeyValueImage.put("route", "trolleybus", "cablecar.png");
		
		// Shop - Food, beverages
		osmKeyValueImage.put("shop", "alcohol", "cablecar.png");
		osmKeyValueImage.put("shop", "bakery", "cablecar.png");
		osmKeyValueImage.put("shop", "beverages", "cablecar.png");
		osmKeyValueImage.put("shop", "brewing_supplies", "cablecar.png");
		osmKeyValueImage.put("shop", "butcher", "cablecar.png");
		osmKeyValueImage.put("shop", "cheese", "cablecar.png");
		osmKeyValueImage.put("shop", "chocolate", "cablecar.png");
		osmKeyValueImage.put("shop", "coffee", "cablecar.png");
		osmKeyValueImage.put("shop", "confectionery", "cablecar.png");
		osmKeyValueImage.put("shop", "convenience", "cablecar.png");
		osmKeyValueImage.put("shop", "deli", "cablecar.png");
		osmKeyValueImage.put("shop", "dairy", "cablecar.png");
		osmKeyValueImage.put("shop", "farm", "cablecar.png");
		osmKeyValueImage.put("shop", "frozen_food", "cablecar.png");
		osmKeyValueImage.put("shop", "greengrocer", "cablecar.png");
		osmKeyValueImage.put("shop", "health_food", "cablecar.png");
		osmKeyValueImage.put("shop", "ice_cream", "cablecar.png");
		osmKeyValueImage.put("shop", "pasta", "cablecar.png");
		osmKeyValueImage.put("shop", "pastry", "cablecar.png");
		osmKeyValueImage.put("shop", "seafood", "cablecar.png");
		osmKeyValueImage.put("shop", "spices", "cablecar.png");
		osmKeyValueImage.put("shop", "tea", "cablecar.png");
		osmKeyValueImage.put("shop", "wine", "cablecar.png");
		osmKeyValueImage.put("shop", "water", "cablecar.png");
		osmKeyValueImage.put("shop", "food", "cablecar.png");
		
		// General store, department store, mall
		osmKeyValueImage.put("shop", "department_store", "cablecar.png");
		osmKeyValueImage.put("shop", "general", "cablecar.png");
		osmKeyValueImage.put("shop", "kiosk", "cablecar.png");
		osmKeyValueImage.put("shop", "mall", "cablecar.png");
		osmKeyValueImage.put("shop", "supermarket", "cablecar.png");
		osmKeyValueImage.put("shop", "wholesale", "cablecar.png");
		
		// Clothing, shoes, accessories
		osmKeyValueImage.put("shop", "baby_goods", "cablecar.png");
		osmKeyValueImage.put("shop", "bag", "cablecar.png");
		osmKeyValueImage.put("shop", "boutique", "cablecar.png");
		osmKeyValueImage.put("shop", "clothes", "cablecar.png");
		osmKeyValueImage.put("shop", "fabric", "cablecar.png");
		osmKeyValueImage.put("shop", "fashion_accessories", "cablecar.png");
		osmKeyValueImage.put("shop", "jewelry", "cablecar.png");
		osmKeyValueImage.put("shop", "leather", "cablecar.png");
		osmKeyValueImage.put("shop", "sewing", "cablecar.png");
		osmKeyValueImage.put("shop", "shoes", "cablecar.png");
		osmKeyValueImage.put("shop", "shoe_repair", "cablecar.png");
		osmKeyValueImage.put("shop", "tailor", "cablecar.png");
		osmKeyValueImage.put("shop", "watches", "cablecar.png");
		osmKeyValueImage.put("shop", "wool", "cablecar.png");
		
		// Discount store, charity
		osmKeyValueImage.put("shop", "charity", "cablecar.png");
		osmKeyValueImage.put("shop", "second_hand", "cablecar.png");
		osmKeyValueImage.put("shop", "variety_store", "cablecar.png");
		
		// Health and beauty
		osmKeyValueImage.put("shop", "beauty", "cablecar.png");
		osmKeyValueImage.put("shop", "chemist", "cablecar.png");
		osmKeyValueImage.put("shop", "cosmetics", "cablecar.png");
		osmKeyValueImage.put("shop", "erotic", "cablecar.png");
		osmKeyValueImage.put("shop", "hairdresser", "cablecar.png");
		osmKeyValueImage.put("shop", "hairdresser_supply", "cablecar.png");
		osmKeyValueImage.put("shop", "hearing_aids", "cablecar.png");
		osmKeyValueImage.put("shop", "herbalist", "cablecar.png");
		osmKeyValueImage.put("shop", "massage", "cablecar.png");
		osmKeyValueImage.put("shop", "medical_supply", "cablecar.png");
		osmKeyValueImage.put("shop", "nutrition_supplements", "cablecar.png");
		osmKeyValueImage.put("shop", "optician", "cablecar.png");
		osmKeyValueImage.put("shop", "perfumery", "cablecar.png");
		osmKeyValueImage.put("shop", "tattoo", "cablecar.png");
		
		// Do-it-yourself, household, building materials, gardening
		osmKeyValueImage.put("shop", "agrarian", "cablecar.png");
		osmKeyValueImage.put("shop", "appliance", "cablecar.png");
		osmKeyValueImage.put("shop", "bathroom_furnishing", "cablecar.png");
		osmKeyValueImage.put("shop", "doityourself", "cablecar.png");
		osmKeyValueImage.put("shop", "electrical", "cablecar.png");
		osmKeyValueImage.put("shop", "energy", "cablecar.png");
		osmKeyValueImage.put("shop", "fireplace", "cablecar.png");
		osmKeyValueImage.put("shop", "florist", "cablecar.png");
		osmKeyValueImage.put("shop", "garden_centre", "cablecar.png");
		osmKeyValueImage.put("shop", "garden_furniture", "cablecar.png");
		osmKeyValueImage.put("shop", "gas", "cablecar.png");
		osmKeyValueImage.put("shop", "glaziery", "cablecar.png");
		osmKeyValueImage.put("shop", "groundskeeping", "cablecar.png");
		osmKeyValueImage.put("shop", "hardware", "cablecar.png");
		osmKeyValueImage.put("shop", "houseware", "cablecar.png");
		osmKeyValueImage.put("shop", "locksmith", "cablecar.png");
		osmKeyValueImage.put("shop", "paint", "cablecar.png");
		osmKeyValueImage.put("shop", "pottery", "cablecar.png");
		osmKeyValueImage.put("shop", "security", "cablecar.png");
		osmKeyValueImage.put("shop", "trade", "cablecar.png");
		
		// Furniture and interior
		osmKeyValueImage.put("shop", "antiques", "cablecar.png");
		osmKeyValueImage.put("shop", "bed", "cablecar.png");
		osmKeyValueImage.put("shop", "candles", "cablecar.png");
		osmKeyValueImage.put("shop", "carpet", "cablecar.png");
		osmKeyValueImage.put("shop", "curtain", "cablecar.png");
		osmKeyValueImage.put("shop", "doors", "cablecar.png");
		osmKeyValueImage.put("shop", "flooring", "cablecar.png");
		osmKeyValueImage.put("shop", "furniture", "cablecar.png");
		osmKeyValueImage.put("shop", "household_linen", "cablecar.png");
		osmKeyValueImage.put("shop", "interior_decoration", "cablecar.png");
		osmKeyValueImage.put("shop", "kitchen", "cablecar.png");
		osmKeyValueImage.put("shop", "lighting", "cablecar.png");
		osmKeyValueImage.put("shop", "tiles", "cablecar.png");
		osmKeyValueImage.put("shop", "window_blind", "cablecar.png");
		
		// Electronics
		osmKeyValueImage.put("shop", "computer", "cablecar.png");
		osmKeyValueImage.put("shop", "electronics", "cablecar.png");
		osmKeyValueImage.put("shop", "hifi", "cablecar.png");
		osmKeyValueImage.put("shop", "mobile_phone", "cablecar.png");
		osmKeyValueImage.put("shop", "radiotechnics", "cablecar.png");
		osmKeyValueImage.put("shop", "telecommunication", "cablecar.png");
		osmKeyValueImage.put("shop", "vacuum_cleaner", "cablecar.png");
		
		// Outdoors and sport, vehicles
		osmKeyValueImage.put("shop", "atv", "cablecar.png");
		osmKeyValueImage.put("shop", "bicycle", "cablecar.png");
		osmKeyValueImage.put("shop", "boat", "cablecar.png");
		osmKeyValueImage.put("shop", "car", "cablecar.png");
		osmKeyValueImage.put("shop", "car_repair", "cablecar.png");
		osmKeyValueImage.put("shop", "motorcycle_repair", "cablecar.png");
		osmKeyValueImage.put("shop", "car_parts", "cablecar.png");
		osmKeyValueImage.put("shop", "caravan", "cablecar.png");
		osmKeyValueImage.put("shop", "fuel", "cablecar.png");
		osmKeyValueImage.put("shop", "fishing", "cablecar.png");
		osmKeyValueImage.put("shop", "surf", "cablecar.png");
		osmKeyValueImage.put("shop", "golf", "cablecar.png");
		osmKeyValueImage.put("shop", "hunting", "cablecar.png");
		osmKeyValueImage.put("shop", "jetski", "cablecar.png");
		osmKeyValueImage.put("shop", "military_surplus", "cablecar.png");
		osmKeyValueImage.put("shop", "motorcycle", "cablecar.png");
		osmKeyValueImage.put("shop", "outdoor", "cablecar.png");
		osmKeyValueImage.put("shop", "scuba_diving", "cablecar.png");
		osmKeyValueImage.put("shop", "ski", "cablecar.png");
		osmKeyValueImage.put("shop", "snowmobile", "cablecar.png");
		osmKeyValueImage.put("shop", "sports", "cablecar.png");
		osmKeyValueImage.put("shop", "swimming_pool", "cablecar.png");
		osmKeyValueImage.put("shop", "trailer", "cablecar.png");
		osmKeyValueImage.put("shop", "tyres", "cablecar.png");
		
		// Art, music, hobbies
		osmKeyValueImage.put("shop", "art", "cablecar.png");
		osmKeyValueImage.put("shop", "camera", "cablecar.png");
		osmKeyValueImage.put("shop", "collector", "cablecar.png");
		osmKeyValueImage.put("shop", "craft", "cablecar.png");
		osmKeyValueImage.put("shop", "frame", "cablecar.png");
		osmKeyValueImage.put("shop", "games", "cablecar.png");
		osmKeyValueImage.put("shop", "model", "cablecar.png");
		osmKeyValueImage.put("shop", "music", "cablecar.png");
		osmKeyValueImage.put("shop", "musical_instrument", "cablecar.png");
		osmKeyValueImage.put("shop", "photo", "cablecar.png");
		osmKeyValueImage.put("shop", "trophy", "cablecar.png");
		osmKeyValueImage.put("shop", "video", "cablecar.png");
		osmKeyValueImage.put("shop", "video_games", "cablecar.png");
		
		// Stationery, gifts, books, newspapers
		osmKeyValueImage.put("shop", "anime", "cablecar.png");
		osmKeyValueImage.put("shop", "books", "cablecar.png");
		osmKeyValueImage.put("shop", "gift", "cablecar.png");
		osmKeyValueImage.put("shop", "lottery", "cablecar.png");
		osmKeyValueImage.put("shop", "newsagent", "cablecar.png");
		osmKeyValueImage.put("shop", "stationery", "cablecar.png");
		osmKeyValueImage.put("shop", "ticket", "cablecar.png");
		
		// Others
		osmKeyValueImage.put("shop", "bookmaker", "cablecar.png");
		osmKeyValueImage.put("shop", "cannabis", "cablecar.png");
		osmKeyValueImage.put("shop", "copyshop", "cablecar.png");
		osmKeyValueImage.put("shop", "dry_cleaning", "cablecar.png");
		osmKeyValueImage.put("shop", "e-cigarette", "cablecar.png");
		osmKeyValueImage.put("shop", "funeral_directors", "cablecar.png");
		osmKeyValueImage.put("shop", "insurance", "cablecar.png");
		osmKeyValueImage.put("shop", "laundry", "cablecar.png");
		osmKeyValueImage.put("shop", "money_lender", "cablecar.png");
		osmKeyValueImage.put("shop", "outpost", "cablecar.png");
		osmKeyValueImage.put("shop", "party", "cablecar.png");
		osmKeyValueImage.put("shop", "pawnbroker", "cablecar.png");
		osmKeyValueImage.put("shop", "pest_control", "cablecar.png");
		osmKeyValueImage.put("shop", "pet", "cablecar.png");
		osmKeyValueImage.put("shop", "pet_grooming", "cablecar.png");
		osmKeyValueImage.put("shop", "pyrotechnics", "cablecar.png");
		osmKeyValueImage.put("shop", "religion", "cablecar.png");
		osmKeyValueImage.put("shop", "storage_rental", "cablecar.png");
		osmKeyValueImage.put("shop", "tobacco", "cablecar.png");
		osmKeyValueImage.put("shop", "toys", "cablecar.png");
		osmKeyValueImage.put("shop", "travel_agency", "cablecar.png");
		osmKeyValueImage.put("shop", "weapons", "cablecar.png");
		osmKeyValueImage.put("shop", "vacant", "cablecar.png");
		osmKeyValueImage.put("shop", "yes", "cablecar.png");
		
		// Sport
		osmKeyValueImage.put("sport", "9pin", "cablecar.png");
		osmKeyValueImage.put("sport", "10pin", "cablecar.png");
		osmKeyValueImage.put("sport", "aerobics", "cablecar.png");
		osmKeyValueImage.put("sport", "american_football", "cablecar.png");
		osmKeyValueImage.put("sport", "aikido", "cablecar.png");
		osmKeyValueImage.put("sport", "archery", "cablecar.png");
		osmKeyValueImage.put("sport", "athletics", "cablecar.png");
		osmKeyValueImage.put("sport", "australian_football", "cablecar.png");
		osmKeyValueImage.put("sport", "badminton", "cablecar.png");
		osmKeyValueImage.put("sport", "bandy", "cablecar.png");
		osmKeyValueImage.put("sport", "baseball", "cablecar.png");
		osmKeyValueImage.put("sport", "basketball", "cablecar.png");
		osmKeyValueImage.put("sport", "beachvolleyball", "cablecar.png");
		osmKeyValueImage.put("sport", "biathlon", "cablecar.png");
		osmKeyValueImage.put("sport", "billiards", "cablecar.png");
		osmKeyValueImage.put("sport", "bmx", "cablecar.png");
		osmKeyValueImage.put("sport", "bobsleigh", "cablecar.png");
		osmKeyValueImage.put("sport", "boules", "cablecar.png");
		osmKeyValueImage.put("sport", "bowls", "cablecar.png");
		osmKeyValueImage.put("sport", "boxing", "cablecar.png");
		osmKeyValueImage.put("sport", "bullfighting", "cablecar.png");
		osmKeyValueImage.put("sport", "canadian_football", "cablecar.png");
		osmKeyValueImage.put("sport", "canoe", "cablecar.png");
		osmKeyValueImage.put("sport", "chess", "cablecar.png");
		osmKeyValueImage.put("sport", "cliff_diving", "cablecar.png");
		osmKeyValueImage.put("sport", "climbing", "cablecar.png");
		osmKeyValueImage.put("sport", "climbing_adventure", "cablecar.png");
		osmKeyValueImage.put("sport", "cockfighting", "cablecar.png");
		osmKeyValueImage.put("sport", "cricket", "cablecar.png");
		osmKeyValueImage.put("sport", "crossfit", "cablecar.png");
		osmKeyValueImage.put("sport", "croquet", "cablecar.png");
		osmKeyValueImage.put("sport", "curling", "cablecar.png");
		osmKeyValueImage.put("sport", "cycle_polo", "cablecar.png");
		osmKeyValueImage.put("sport", "cycling", "cablecar.png");
		osmKeyValueImage.put("sport", "darts", "cablecar.png");
		osmKeyValueImage.put("sport", "dog_agility", "cablecar.png");
		osmKeyValueImage.put("sport", "dog_racing", "cablecar.png");
		osmKeyValueImage.put("sport", "dragon_boat", "cablecar.png");
		osmKeyValueImage.put("sport", "equestrian", "cablecar.png");
		osmKeyValueImage.put("sport", "fencing", "cablecar.png");
		osmKeyValueImage.put("sport", "field_hockey", "cablecar.png");
		osmKeyValueImage.put("sport", "fitness", "cablecar.png");
		osmKeyValueImage.put("sport", "five-a-side", "cablecar.png");
		osmKeyValueImage.put("sport", "floorball", "cablecar.png");
		osmKeyValueImage.put("sport", "four_square", "cablecar.png");
		osmKeyValueImage.put("sport", "free_flying", "cablecar.png");
		osmKeyValueImage.put("sport", "futsal", "cablecar.png");
		osmKeyValueImage.put("sport", "gaelic_games", "cablecar.png");
		osmKeyValueImage.put("sport", "gaga", "cablecar.png");
		osmKeyValueImage.put("sport", "golf", "cablecar.png");
		osmKeyValueImage.put("sport", "gymnastics", "cablecar.png");
		osmKeyValueImage.put("sport", "handball", "cablecar.png");
		osmKeyValueImage.put("sport", "hapkido", "cablecar.png");
		osmKeyValueImage.put("sport", "hiking", "cablecar.png");
		osmKeyValueImage.put("sport", "horseshoes", "cablecar.png");
		osmKeyValueImage.put("sport", "horse_racing", "cablecar.png");
		osmKeyValueImage.put("sport", "ice_hockey", "cablecar.png");
		osmKeyValueImage.put("sport", "ice_skating", "cablecar.png");
		osmKeyValueImage.put("sport", "ice_stock", "cablecar.png");
		osmKeyValueImage.put("sport", "judo", "cablecar.png");
		osmKeyValueImage.put("sport", "karate", "cablecar.png");
		osmKeyValueImage.put("sport", "karting", "cablecar.png");
		osmKeyValueImage.put("sport", "kickboxing", "cablecar.png");
		osmKeyValueImage.put("sport", "kitesurfing", "cablecar.png");
		osmKeyValueImage.put("sport", "korfball", "cablecar.png");
		osmKeyValueImage.put("sport", "krachtbal", "cablecar.png");
		osmKeyValueImage.put("sport", "lacrosse", "cablecar.png");
		osmKeyValueImage.put("sport", "laser_tag", "cablecar.png");
		osmKeyValueImage.put("sport", "martial_arts", "cablecar.png");
		osmKeyValueImage.put("sport", "miniature_golf", "cablecar.png");
		osmKeyValueImage.put("sport", "model_aerodrome", "cablecar.png");
		osmKeyValueImage.put("sport", "motocross", "cablecar.png");
		osmKeyValueImage.put("sport", "motor", "cablecar.png");
		osmKeyValueImage.put("sport", "multi", "cablecar.png");
		osmKeyValueImage.put("sport", "netball", "cablecar.png");
		osmKeyValueImage.put("sport", "obstacle_course", "cablecar.png");
		osmKeyValueImage.put("sport", "orienteering", "cablecar.png");
		osmKeyValueImage.put("sport", "paddle_tennis", "cablecar.png");
		osmKeyValueImage.put("sport", "padel", "cablecar.png");
		osmKeyValueImage.put("sport", "paintball", "cablecar.png");
		osmKeyValueImage.put("sport", "parachuting", "cablecar.png");
		osmKeyValueImage.put("sport", "parkour", "cablecar.png");
		osmKeyValueImage.put("sport", "pelota", "cablecar.png");
		osmKeyValueImage.put("sport", "pesapallo", "cablecar.png");
		osmKeyValueImage.put("sport", "pickleball", "cablecar.png");
		osmKeyValueImage.put("sport", "pilates", "cablecar.png");
		osmKeyValueImage.put("sport", "pole_dance", "cablecar.png");
		osmKeyValueImage.put("sport", "racquet", "cablecar.png");
		osmKeyValueImage.put("sport", "rc_car", "cablecar.png");
		osmKeyValueImage.put("sport", "roller_skating", "cablecar.png");
		osmKeyValueImage.put("sport", "rowing", "cablecar.png");
		osmKeyValueImage.put("sport", "rugby_league", "cablecar.png");
		osmKeyValueImage.put("sport", "rugby_union", "cablecar.png");
		osmKeyValueImage.put("sport", "running", "cablecar.png");
		osmKeyValueImage.put("sport", "sailing", "cablecar.png");
		osmKeyValueImage.put("sport", "scuba_diving", "cablecar.png");
		osmKeyValueImage.put("sport", "shooting", "cablecar.png");
		osmKeyValueImage.put("sport", "shot-put", "cablecar.png");
		osmKeyValueImage.put("sport", "skateboard", "cablecar.png");
		osmKeyValueImage.put("sport", "ski_jumping", "cablecar.png");
		osmKeyValueImage.put("sport", "skiing", "cablecar.png");
		osmKeyValueImage.put("sport", "snooker", "cablecar.png");
		osmKeyValueImage.put("sport", "soccer", "cablecar.png");
		osmKeyValueImage.put("sport", "softball", "cablecar.png");
		osmKeyValueImage.put("sport", "speedway", "cablecar.png");
		osmKeyValueImage.put("sport", "squash", "cablecar.png");
		osmKeyValueImage.put("sport", "sumo", "cablecar.png");
		osmKeyValueImage.put("sport", "surfing", "cablecar.png");
		osmKeyValueImage.put("sport", "swimming", "cablecar.png");
		osmKeyValueImage.put("sport", "table_tennis", "cablecar.png");
		osmKeyValueImage.put("sport", "table_soccer", "cablecar.png");
		osmKeyValueImage.put("sport", "taekwondo", "cablecar.png");
		osmKeyValueImage.put("sport", "tennis", "cablecar.png");
		osmKeyValueImage.put("sport", "teqball", "cablecar.png");
		osmKeyValueImage.put("sport", "toboggan", "cablecar.png");
		osmKeyValueImage.put("sport", "trugo", "cablecar.png");
		osmKeyValueImage.put("sport", "ultimate", "cablecar.png");
		osmKeyValueImage.put("sport", "volleyball", "cablecar.png");
		osmKeyValueImage.put("sport", "wakeboarding", "cablecar.png");
		osmKeyValueImage.put("sport", "water_polo", "cablecar.png");
		osmKeyValueImage.put("sport", "water_ski", "cablecar.png");
		osmKeyValueImage.put("sport", "weightlifting", "cablecar.png");
		osmKeyValueImage.put("sport", "windsurfing", "cablecar.png");
		osmKeyValueImage.put("sport", "wrestling", "cablecar.png");
		osmKeyValueImage.put("sport", "yoga", "cablecar.png");
		osmKeyValueImage.put("sport", "zurkhaneh_sport", "cablecar.png");
		
		// Telecom
		osmKeyValueImage.put("telecom", "exchange", "cablecar.png");
		osmKeyValueImage.put("telecom", "connection_point", "cablecar.png");
		osmKeyValueImage.put("telecom", "distribution_point", "cablecar.png");
		osmKeyValueImage.put("telecom", "service_device", "cablecar.png");
		osmKeyValueImage.put("telecom", "data_center", "cablecar.png");
		
		// Tourism
		osmKeyValueImage.put("tourism", "alpine_hut", "cablecar.png");
		osmKeyValueImage.put("tourism", "apartment", "cablecar.png");
		osmKeyValueImage.put("tourism", "aquarium", "cablecar.png");
		osmKeyValueImage.put("tourism", "artwork", "cablecar.png");
		osmKeyValueImage.put("tourism", "attraction", "cablecar.png");
		osmKeyValueImage.put("tourism", "camp_pitch", "cablecar.png");
		osmKeyValueImage.put("tourism", "camp_site", "cablecar.png");
		osmKeyValueImage.put("tourism", "caravan_site", "cablecar.png");
		osmKeyValueImage.put("tourism", "chalet", "cablecar.png");
		osmKeyValueImage.put("tourism", "gallery", "cablecar.png");
		osmKeyValueImage.put("tourism", "guest_house", "cablecar.png");
		osmKeyValueImage.put("tourism", "hostel", "cablecar.png");
		osmKeyValueImage.put("tourism", "hotel", "cablecar.png");
		osmKeyValueImage.put("tourism", "information", "cablecar.png");
		osmKeyValueImage.put("tourism", "motel", "cablecar.png");
		osmKeyValueImage.put("tourism", "museum", "cablecar.png");
		osmKeyValueImage.put("tourism", "picnic_site", "cablecar.png");
		osmKeyValueImage.put("tourism", "theme_park", "cablecar.png");
		osmKeyValueImage.put("tourism", "viewpoint", "cablecar.png");
		osmKeyValueImage.put("tourism", "wilderness_hut", "cablecar.png");
		osmKeyValueImage.put("tourism", "zoo", "cablecar.png");
		osmKeyValueImage.put("tourism", "yes", "cablecar.png");
		
		// Water
		osmKeyValueImage.put("water", "river", "cablecar.png");
		osmKeyValueImage.put("water", "oxbow", "cablecar.png");
		osmKeyValueImage.put("water", "canal", "cablecar.png");
		osmKeyValueImage.put("water", "ditch", "cablecar.png");
		osmKeyValueImage.put("water", "lock", "cablecar.png");
		osmKeyValueImage.put("water", "fish_pass", "cablecar.png");
		osmKeyValueImage.put("water", "lake", "cablecar.png");
		osmKeyValueImage.put("water", "reservoir", "cablecar.png");
		osmKeyValueImage.put("water", "pond", "cablecar.png");
		osmKeyValueImage.put("water", "basin", "cablecar.png");
		osmKeyValueImage.put("water", "lagoon", "cablecar.png");
		osmKeyValueImage.put("water", "stream_pool", "cablecar.png");
		osmKeyValueImage.put("water", "reflecting_pool", "cablecar.png");
		osmKeyValueImage.put("water", "moat", "cablecar.png");
		osmKeyValueImage.put("water", "wastewater", "cablecar.png");
		
		// Waterway
		osmKeyValueImage.put("waterway", "river", "cablecar.png");
		osmKeyValueImage.put("waterway", "riverbank", "cablecar.png");
		osmKeyValueImage.put("waterway", "stream", "cablecar.png");
		osmKeyValueImage.put("waterway", "tidal_channel", "cablecar.png");
		
		// Man-made waterways
		osmKeyValueImage.put("waterway", "canal", "cablecar.png");
		osmKeyValueImage.put("waterway", "drain", "cablecar.png");
		osmKeyValueImage.put("waterway", "ditch", "cablecar.png");
		osmKeyValueImage.put("waterway", "pressurised", "cablecar.png");
		osmKeyValueImage.put("waterway", "fairway", "cablecar.png");
		
		// Facilities
		osmKeyValueImage.put("waterway", "dock", "cablecar.png");
		osmKeyValueImage.put("waterway", "boatyard", "cablecar.png");
		
		// Barriers on waterways
		osmKeyValueImage.put("waterway", "dam", "cablecar.png");
		osmKeyValueImage.put("waterway", "weir", "cablecar.png");
		osmKeyValueImage.put("waterway", "waterfall", "cablecar.png");
		osmKeyValueImage.put("waterway", "lock_gate", "cablecar.png");
		
		// Other features on waterways
		osmKeyValueImage.put("waterway", "soakhole", "cablecar.png");
		osmKeyValueImage.put("waterway", "turning_point", "cablecar.png");
		osmKeyValueImage.put("waterway", "water_point", "cablecar.png");
		osmKeyValueImage.put("waterway", "fuel", "cablecar.png");
	}
	
	public static OsmKeyValueMap getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new OsmKeyValueMap();
		}
		return INSTANCE;
	}
	
	public String getImage(String key, String value) {
		if (osmKeyValueImage.containsKey(key, value)) {
			return osmKeyValueImage.get(key, value).toString();
		}
		return "undef.png";
	}
		
}
