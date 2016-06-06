/* Copyright (C) 2016 IBM Corporation
 *
 */

package com.ibm.developerWorks.demo.json.response;

import java.util.HashMap;
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
    "tree",
    "id",
    "source",
    "word_count",
    "word_count_message"
})
public class ResponsePI {

    @JsonProperty("tree")
    private Tree tree;
    @JsonProperty("id")
    private String id;
    @JsonProperty("source")
    private String source;
    @JsonProperty("word_count")
    private Integer wordCount;
    @JsonProperty("word_count_message")
    private String wordCountMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The tree
     */
    @JsonProperty("tree")
    public Tree getTree() {
        return tree;
    }

    /**
     * 
     * @param tree
     *     The tree
     */
    @JsonProperty("tree")
    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public ResponsePI withTree(Tree tree) {
        this.tree = tree;
        return this;
    }

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

    public ResponsePI withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public ResponsePI withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 
     * @return
     *     The wordCount
     */
    @JsonProperty("word_count")
    public Integer getWordCount() {
        return wordCount;
    }

    /**
     * 
     * @param wordCount
     *     The word_count
     */
    @JsonProperty("word_count")
    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public ResponsePI withWordCount(Integer wordCount) {
        this.wordCount = wordCount;
        return this;
    }

    /**
     * 
     * @return
     *     The wordCountMessage
     */
    @JsonProperty("word_count_message")
    public String getWordCountMessage() {
        return wordCountMessage;
    }

    /**
     * 
     * @param wordCountMessage
     *     The word_count_message
     */
    @JsonProperty("word_count_message")
    public void setWordCountMessage(String wordCountMessage) {
        this.wordCountMessage = wordCountMessage;
    }

    public ResponsePI withWordCountMessage(String wordCountMessage) {
        this.wordCountMessage = wordCountMessage;
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

    public ResponsePI withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}

