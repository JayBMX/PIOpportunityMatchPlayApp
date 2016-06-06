/* Copyright (C) 2016 IBM Corporation
 *
 */

package com.ibm.developerWorks.demo.json.response;

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
    "id",
    "name",
    "percentage",
    "children",
    "sampling_error"
})
public class Tree {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("percentage")
    private Double percentage;
    @JsonProperty("children")
    private List<Tree> children = new ArrayList<Tree>();
    @JsonProperty("sampling_error")
    private Integer samplingError;			//make this Double. Json schema generator screwed up
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Tree withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Tree withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The percentage
     */
    @JsonProperty("percentage")
    public Double getPercentage() {
        return percentage;
    }

    /**
     * 
     * @param percentage
     *     The percentage
     */
    @JsonProperty("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Tree withPercentage(Double percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * 
     * @return
     *     The children
     */
    @JsonProperty("children")
    public List<Tree> getChildren() {
        return children;
    }

    /**
     * 
     * @param children
     *     The children
     */
    @JsonProperty("children")
    public void setChildren(List<Tree> children) {
        this.children = children;
    }

    public Tree withChildren(List<Tree> children) {
        this.children = children;
        return this;
    }

    /**
     * 
     * @return
     *     The samplingError
     */
    @JsonProperty("sampling_error")
    public Integer getSamplingError() {
        return samplingError;
    }

    /**
     * 
     * @param samplingError
     *     The sampling_error
     */
    @JsonProperty("sampling_error")
    public void setSamplingError(Integer samplingError) {
        this.samplingError = samplingError;
    }

    public Tree withSamplingError(Integer samplingError) {
        this.samplingError = samplingError;
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

    public Tree withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
