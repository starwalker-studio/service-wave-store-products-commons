package com.wavestore.service.products.commons.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wavestore_guitar_amp_cabinet")
public class GuitarAmpCabinet implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_guitar_amp_cabinet", unique = true, nullable = false)
	private int id;

	private int brand;

	private String model;

	private String description;

	private double price;

	private String img;

	@Column(name = "img_large")
	private String imgLarge;

	@Column(name = "cabinet_info")
	private String cabinetInfo;

	@Column(name = "amp_configuration")
	private String ampConfig;

	private String speakers;

	@Column(name = "power_handling")
	private String powerHandling;

	private String impedance;

	@Column(name = "mono_stereo")
	private String monoStereo;

	@Column(name = "cabinet_type")
	private String cabinetType;

	@Column(name = "open_closed_back")
	private String openClosedBack;

	private String inputs;

	@Column(name = "construction_material")
	private String construccionMaterial;

	private String height;

	private String width;

	private String depth;

	private String weight;

	@Column(name = "manufacturer_part_number")
	private String manufacturerPartNumber;
	
	public GuitarAmpCabinet() {
		super();
	}

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

	public String getCabinetInfo() {
		return cabinetInfo;
	}

	public void setCabinetInfo(String cabinetInfo) {
		this.cabinetInfo = cabinetInfo;
	}

	public String getAmpConfig() {
		return ampConfig;
	}

	public void setAmpConfig(String ampConfig) {
		this.ampConfig = ampConfig;
	}

	public String getSpeakers() {
		return speakers;
	}

	public void setSpeakers(String speakers) {
		this.speakers = speakers;
	}

	public String getPowerHandling() {
		return powerHandling;
	}

	public void setPowerHandling(String powerHandling) {
		this.powerHandling = powerHandling;
	}

	public String getImpedance() {
		return impedance;
	}

	public void setImpedance(String impedance) {
		this.impedance = impedance;
	}

	public String getMonoStereo() {
		return monoStereo;
	}

	public void setMonoStereo(String monoStereo) {
		this.monoStereo = monoStereo;
	}

	public String getCabinetType() {
		return cabinetType;
	}

	public void setCabinetType(String cabinetType) {
		this.cabinetType = cabinetType;
	}

	public String getOpenClosedBack() {
		return openClosedBack;
	}

	public void setOpenClosedBack(String openClosedBack) {
		this.openClosedBack = openClosedBack;
	}

	public String getInputs() {
		return inputs;
	}

	public void setInputs(String inputs) {
		this.inputs = inputs;
	}

	public String getConstruccionMaterial() {
		return construccionMaterial;
	}

	public void setConstruccionMaterial(String construccionMaterial) {
		this.construccionMaterial = construccionMaterial;
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
