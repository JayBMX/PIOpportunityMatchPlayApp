/* Copyright (C) 2016 IBM Corporation
 *
 */

package com.ibm.developerWorks.demo.json.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contentItems"
})
public class RequestPI {

    @JsonProperty("contentItems")
    private List<ContentItem> contentItems = new ArrayList<ContentItem>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The contentItems
     */
    @JsonProperty("contentItems")
    public List<ContentItem> getContentItems() {
        return contentItems;
    }

    /**
     * 
     * @param contentItems
     *     The contentItems
     */
    @JsonProperty("contentItems")
    public void setContentItems(List<ContentItem> contentItems) {
        this.contentItems = contentItems;
    }

    public RequestPI withContentItems(List<ContentItem> contentItems) {
        this.contentItems = contentItems;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public RequestPI withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}