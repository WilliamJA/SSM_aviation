package per.martin.aviation.aircraft.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table aircraft_type
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class AircraftType {
    /**
     *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
     * aircraft_type_id
     */
    private Integer aircraftTypeId;

    /**
     * 机型
     * type
     */
    private String type;

    /**
     * 最大燃油（升）
     * max_fuel
     */
    private Integer maxFuel;

    /**
     * 最大起飞重量（kg）
     * max_takeoff_weight
     */
    private Integer maxTakeoffWeight;

    /**
     * 引擎数量
     * engine_count
     */
    private Integer engineCount;

    /**
     * 最大推力（kg）
     * max_thrust
     */
    private Integer maxThrust;

    /**
     * 巡航距离（km）
     * cruising_distance
     */
    private Integer cruisingDistance;

    /**
     * 最大座位数
     * max_seat
     */
    private Integer maxSeat;

    /**
     * 机高（米）
     * heigh
     */
    private Double heigh;

    /**
     * 长度（米）
     * length
     */
    private Double length;

    /**
     * 翼展（米）
     * width
     */
    private Double width;

    /**
     * 客舱宽度（米）
     * cabin_width
     */
    private Double cabinWidth;

    /**
     * 最大航行速度（马赫）
     * max_speed
     */
    private Double maxSpeed;

    /**
     * 引擎类型
     * engine_type
     */
    private String engineType;

    /**
     * 航行速度（马赫）
     * cruising_speed
     */
    private Double cruisingSpeed;

    /**
     * 制造商信息
     * company
     */
    private Integer company;

    /**
     * 机型图片
     * pic
     */
    private String pic;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.aircraft_type_id
     *
     * @return the value of aircraft_type.aircraft_type_id
     *
     * @mbggenerated
     */
    public Integer getAircraftTypeId() {
        return aircraftTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.aircraft_type_id
     *
     * @param aircraftTypeId the value for aircraft_type.aircraft_type_id
     *
     * @mbggenerated
     */
    public void setAircraftTypeId(Integer aircraftTypeId) {
        this.aircraftTypeId = aircraftTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.type
     *
     * @return the value of aircraft_type.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.type
     *
     * @param type the value for aircraft_type.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.max_fuel
     *
     * @return the value of aircraft_type.max_fuel
     *
     * @mbggenerated
     */
    public Integer getMaxFuel() {
        return maxFuel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.max_fuel
     *
     * @param maxFuel the value for aircraft_type.max_fuel
     *
     * @mbggenerated
     */
    public void setMaxFuel(Integer maxFuel) {
        this.maxFuel = maxFuel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.max_takeoff_weight
     *
     * @return the value of aircraft_type.max_takeoff_weight
     *
     * @mbggenerated
     */
    public Integer getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.max_takeoff_weight
     *
     * @param maxTakeoffWeight the value for aircraft_type.max_takeoff_weight
     *
     * @mbggenerated
     */
    public void setMaxTakeoffWeight(Integer maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.engine_count
     *
     * @return the value of aircraft_type.engine_count
     *
     * @mbggenerated
     */
    public Integer getEngineCount() {
        return engineCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.engine_count
     *
     * @param engineCount the value for aircraft_type.engine_count
     *
     * @mbggenerated
     */
    public void setEngineCount(Integer engineCount) {
        this.engineCount = engineCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.max_thrust
     *
     * @return the value of aircraft_type.max_thrust
     *
     * @mbggenerated
     */
    public Integer getMaxThrust() {
        return maxThrust;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.max_thrust
     *
     * @param maxThrust the value for aircraft_type.max_thrust
     *
     * @mbggenerated
     */
    public void setMaxThrust(Integer maxThrust) {
        this.maxThrust = maxThrust;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.cruising_distance
     *
     * @return the value of aircraft_type.cruising_distance
     *
     * @mbggenerated
     */
    public Integer getCruisingDistance() {
        return cruisingDistance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.cruising_distance
     *
     * @param cruisingDistance the value for aircraft_type.cruising_distance
     *
     * @mbggenerated
     */
    public void setCruisingDistance(Integer cruisingDistance) {
        this.cruisingDistance = cruisingDistance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.max_seat
     *
     * @return the value of aircraft_type.max_seat
     *
     * @mbggenerated
     */
    public Integer getMaxSeat() {
        return maxSeat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.max_seat
     *
     * @param maxSeat the value for aircraft_type.max_seat
     *
     * @mbggenerated
     */
    public void setMaxSeat(Integer maxSeat) {
        this.maxSeat = maxSeat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.heigh
     *
     * @return the value of aircraft_type.heigh
     *
     * @mbggenerated
     */
    public Double getHeigh() {
        return heigh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.heigh
     *
     * @param heigh the value for aircraft_type.heigh
     *
     * @mbggenerated
     */
    public void setHeigh(Double heigh) {
        this.heigh = heigh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.length
     *
     * @return the value of aircraft_type.length
     *
     * @mbggenerated
     */
    public Double getLength() {
        return length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.length
     *
     * @param length the value for aircraft_type.length
     *
     * @mbggenerated
     */
    public void setLength(Double length) {
        this.length = length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.width
     *
     * @return the value of aircraft_type.width
     *
     * @mbggenerated
     */
    public Double getWidth() {
        return width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.width
     *
     * @param width the value for aircraft_type.width
     *
     * @mbggenerated
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.cabin_width
     *
     * @return the value of aircraft_type.cabin_width
     *
     * @mbggenerated
     */
    public Double getCabinWidth() {
        return cabinWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.cabin_width
     *
     * @param cabinWidth the value for aircraft_type.cabin_width
     *
     * @mbggenerated
     */
    public void setCabinWidth(Double cabinWidth) {
        this.cabinWidth = cabinWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.max_speed
     *
     * @return the value of aircraft_type.max_speed
     *
     * @mbggenerated
     */
    public Double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.max_speed
     *
     * @param maxSpeed the value for aircraft_type.max_speed
     *
     * @mbggenerated
     */
    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.engine_type
     *
     * @return the value of aircraft_type.engine_type
     *
     * @mbggenerated
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.engine_type
     *
     * @param engineType the value for aircraft_type.engine_type
     *
     * @mbggenerated
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType == null ? null : engineType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.cruising_speed
     *
     * @return the value of aircraft_type.cruising_speed
     *
     * @mbggenerated
     */
    public Double getCruisingSpeed() {
        return cruisingSpeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.cruising_speed
     *
     * @param cruisingSpeed the value for aircraft_type.cruising_speed
     *
     * @mbggenerated
     */
    public void setCruisingSpeed(Double cruisingSpeed) {
        this.cruisingSpeed = cruisingSpeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.company
     *
     * @return the value of aircraft_type.company
     *
     * @mbggenerated
     */
    public Integer getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.company
     *
     * @param company the value for aircraft_type.company
     *
     * @mbggenerated
     */
    public void setCompany(Integer company) {
        this.company = company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aircraft_type.pic
     *
     * @return the value of aircraft_type.pic
     *
     * @mbggenerated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aircraft_type.pic
     *
     * @param pic the value for aircraft_type.pic
     *
     * @mbggenerated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}