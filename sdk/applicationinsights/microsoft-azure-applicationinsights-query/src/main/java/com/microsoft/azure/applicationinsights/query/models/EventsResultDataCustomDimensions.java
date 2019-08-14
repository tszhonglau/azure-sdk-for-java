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
 * Custom dimensions of the event.
 */
public class EventsResultDataCustomDimensions {
    /**
     * The additionalProperties property.
     */
    @JsonProperty(value = "additionalProperties")
    private Object additionalProperties;

    /**
     * Get the additionalProperties value.
     *
     * @return the additionalProperties value
     */
    public Object additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties value.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the EventsResultDataCustomDimensions object itself.
     */
    public EventsResultDataCustomDimensions withAdditionalProperties(Object additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

}