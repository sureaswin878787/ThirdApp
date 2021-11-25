package in.aswinit.response;

public class Flight {
	 private String code;
     private Integer price;
     private String origin;
     private String destination;
     private String departureDate;
     private String planeType;
     private String airlineName;
     private Integer emptySeats;
	@Override
	public String toString() {
		return "Flight [code=" + code + ", price=" + price + ", origin=" + origin + ", destination=" + destination
				+ ", departureDate=" + departureDate + ", planeType=" + planeType + ", airlineName=" + airlineName
				+ ", emptySeats=" + emptySeats + "]";
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the departureDate
	 */
	public String getDepartureDate() {
		return departureDate;
	}
	/**
	 * @param departureDate the departureDate to set
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	/**
	 * @return the planeType
	 */
	public String getPlaneType() {
		return planeType;
	}
	/**
	 * @param planeType the planeType to set
	 */
	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}
	/**
	 * @return the airlineName
	 */
	public String getAirlineName() {
		return airlineName;
	}
	/**
	 * @param airlineName the airlineName to set
	 */
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	/**
	 * @return the emptySeats
	 */
	public Integer getEmptySeats() {
		return emptySeats;
	}
	/**
	 * @param emptySeats the emptySeats to set
	 */
	public void setEmptySeats(Integer emptySeats) {
		this.emptySeats = emptySeats;
	}
     
}
