/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The custom metric info.
 */
public class EventsCustomMetricInfo {
    /**
     * The name of the custom metric.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The value of the custom metric.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * The sum of the custom metric.
     */
    @JsonProperty(value = "valueSum")
    private Double valueSum;

    /**
     * The count of the custom metric.
     */
    @JsonProperty(value = "valueCount")
    private Integer valueCount;

    /**
     * The minimum value of the custom metric.
     */
    @JsonProperty(value = "valueMin")
    private Double valueMin;

    /**
     * The maximum value of the custom metric.
     */
    @JsonProperty(value = "valueMax")
    private Double valueMax;

    /**
     * The standard deviation of the custom metric.
     */
    @JsonProperty(value = "valueStdDev")
    private Double valueStdDev;

    /**
     * Get the name of the custom metric.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the custom metric.
     *
     * @param name the name value to set
     * @return the EventsCustomMetricInfo object itself.
     */
    public EventsCustomMetricInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of the custom metric.
     *
     * @return the value value
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the value of the custom metric.
     *
     * @param value the value value to set
     * @return the EventsCustomMetricInfo object itself.
     */
    public EventsCustomMetricInfo withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Get the sum of the custom metric.
     *
     * @return the valueSum value
     */
    public Double valueSum() {
        return this.valueSum;
    }

    /**
     * Set the sum of the custom metric.
     *
     * @param valueSum the valueSum value to set
     * @return the EventsCustomMetricInfo object itself.
     */
    public EventsCustomMetricInfo withValueSum(Double valueSum) {
        this.valueSum = valueSum;
        return this;
    }

    /**
     * Get the count of the custom metric.
     *
     * @return the valueCount value
     */
    public Integer valueCount() {
        return this.valueCount;
    }

    /**
     * Set the count of the custom metric.
     *
     * @param valueCount the valueCount value to set
     * @return the EventsCustomMetricInfo object itself.
     */
    public EventsCustomMetricInfo withValueCount(Integer valueCount) {
        this.valueCount = valueCount;
        return this;
    }

    /**
     * Get the minimum value of the custom metric.
     *
     * @return the valueMin value
     */
    public Double valueMin() {
        return this.valueMin;
    }

    /**
     * Set the minimum value of the custom metric.
     *
     * @param valueMin the valueMin value to set
     * @return the EventsCustomMetricInfo object itself.
     */
    public EventsCustomMetricInfo withValueMin(Double valueMin) {
        this.valueMin = valueMin;
        return this;
    }

    /**
     * Get the maximum value of the custom metric.
     *
     * @return the valueMax value
     */
    public Double valueMax() {
        return this.valueMax;
    }

    /**
     * Set the maximum value of the custom metric.
     *
     * @param valueMax the valueMax value to set
     * @return the EventsCustomMetricInfo object itself.
     */
    public EventsCustomMetricInfo withValueMax(Double valueMax) {
        this.valueMax = valueMax;
        return this;
    }

    /**
     * Get the standard deviation of the custom metric.
     *
     * @return the valueStdDev value
     */
    public Double valueStdDev() {
        return this.valueStdDev;
    }

    /**
     * Set the standard deviation of the custom metric.
     *
     * @param valueStdDev the valueStdDev value to set
     * @return the EventsCustomMetricInfo object itself.
     */
    public EventsCustomMetricInfo withValueStdDev(Double valueStdDev) {
        this.valueStdDev = valueStdDev;
        return this;
    }

}