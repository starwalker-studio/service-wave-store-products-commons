package com.wavestore.service.products.commons.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wavestore_guitar_amp_head")
public class GuitarAmpHead implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_guitar_amp_head", unique = true, nullable = false)
	private int id;

	private int brand;

	private String model;

	private String description;

	private double price;

	private String img;

	@Column(name = "img_large")
	private String imgLarge;

	@Column(name = "head_info")
	private String headInfo;

	@Column(name = "amp_type")
	private String ampType;

	@Column(name = "number_of_channels")
	private String numberOfChannels;

	@Column(name = "total_power")
	private String totalPower;

	@Column(name = "pre_amp_tubes")
	private String preAmpTubes;

	@Column(name = "power_tubes")
	private String powerTubes;

	@Column(name = "amp_eq")
	private String ampEQ;

	private String inputs;

	@Column(name = "effect_loop")
	private String effectLoop;

	@Column(name = "foot_switch")
	private String footSwitch;

	@Column(name = "construction_material")
	private String construccionMaterial;

	@Column(name = "power_source")
	private String powerSource;

	private String height;

	private String width;

	private String depth;

	private String weight;

	@Column(name = "manufacturer_part_number")
	private String manufacturerPartNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getImgLarge() {
		return imgLarge;
	}

	public void setImgLarge(String imgLarge) {
		this.imgLarge = imgLarge;
	}

	public String getHeadInfo() {
		return headInfo;
	}

	public void setHeadInfo(String headInfo) {
		this.headInfo = headInfo;
	}

	public String getAmpType() {
		return ampType;
	}

	public void setAmpType(String ampType) {
		this.ampType = ampType;
	}

	public String getNumberOfChannels() {
		return numberOfChannels;
	}

	public void setNumberOfChannels(String numberOfChannels) {
		this.numberOfChannels = numberOfChannels;
	}

	public String getTotalPower() {
		return totalPower;
	}

	public void setTotalPower(String totalPower) {
		this.totalPower = totalPower;
	}

	public String getPreAmpTubes() {
		return preAmpTubes;
	}

	public void setPreAmpTubes(String preAmpTubes) {
		this.preAmpTubes = preAmpTubes;
	}

	public String getPowerTubes() {
		return powerTubes;
	}

	public void setPowerTubes(String powerTubes) {
		this.powerTubes = powerTubes;
	}

	public String getAmpEQ() {
		return ampEQ;
	}

	public void setAmpEQ(String ampEQ) {
		this.ampEQ = ampEQ;
	}

	public String getInputs() {
		return inputs;
	}

	public void setInputs(String inputs) {
		this.inputs = inputs;
	}

	public String getEffectLoop() {
		return effectLoop;
	}

	public void setEffectLoop(String effectLoop) {
		this.effectLoop = effectLoop;
	}

	public String getFootSwitch() {
		return footSwitch;
	}

	public void setFootSwitch(String footSwitch) {
		this.footSwitch = footSwitch;
	}

	public String getConstruccionMaterial() {
		return construccionMaterial;
	}

	public void setConstruccionMaterial(String construccionMaterial) {
		this.construccionMaterial = construccionMaterial;
	}

	public String getPowerSource() {
		return powerSource;
	}

	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getManufacturerPartNumber() {
		return manufacturerPartNumber;
	}

	public void setManufacturerPartNumber(String manufacturerPartNumber) {
		this.manufacturerPartNumber = manufacturerPartNumber;
	}

}
