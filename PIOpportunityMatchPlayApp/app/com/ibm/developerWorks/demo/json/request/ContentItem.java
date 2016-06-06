/* Copyright (C) 2016 IBM Corporation
 *
 */

package com.ibm.developerWorks.demo.json.request;

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
    "id",
    "userid",
    "sourceid",
    "created",
    "updated",
    "contenttype",
    "charset",
    "language",
    "content",
    "parentid",
    "reply",
    "forward"
})
public class ContentItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("userid")
    private String userid;
    @JsonProperty("sourceid")
    private String sourceid;
    @JsonProperty("created")
    private String created;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("contenttype")
    private String contenttype;
    @JsonProperty("charset")
    private String charset;
    @JsonProperty("language")
    private String language;
    @JsonProperty("content")
    private String content;
    @JsonProperty("parentid")
    private String parentid;
    @JsonProperty("reply")
    private Boolean reply;
    @JsonProperty("forward")
    private Boolean forward;
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

    public ContentItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The userid
     */
    @JsonProperty("userid")
    public String getUserid() {
        return userid;
    }

    /**
     * 
     * @param userid
     *     The userid
     */
    @JsonProperty("userid")
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public ContentItem withUserid(String userid) {
        this.userid = userid;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceid
     */
    @JsonProperty("sourceid")
    public String getSourceid() {
        return sourceid;
    }

    /**
     * 
     * @param sourceid
     *     The sourceid
     */
    @JsonProperty("sourceid")
    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    public ContentItem withSourceid(String sourceid) {
        this.sourceid = sourceid;
        return this;
    }

    /**
     * 
     * @return
     *     The created
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    public ContentItem withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 
     * @return
     *     The updated
     */
    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    /**
     * 
     * @param updated
     *     The updated
     */
    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ContentItem withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 
     * @return
     *     The contenttype
     */
    @JsonProperty("contenttype")
    public String getContenttype() {
        return contenttype;
    }

    /**
     * 
     * @param contenttype
     *     The contenttype
     */
    @JsonProperty("contenttype")
    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public ContentItem withContenttype(String contenttype) {
        this.contenttype = contenttype;
        return this;
    }

    /**
     * 
     * @return
     *     The charset
     */
    @JsonProperty("charset")
    public String getCharset() {
        return charset;
    }

    /**
     * 
     * @param charset
     *     The charset
     */
    @JsonProperty("charset")
    public void setCharset(String charset) {
        this.charset = charset;
    }

    public ContentItem withCharset(String charset) {
        this.charset = charset;
        return this;
    }

    /**
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public ContentItem withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 
     * @return
     *     The content
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public ContentItem withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 
     * @return
     *     The parentid
     */
    @JsonProperty("parentid")
    public String getParentid() {
        return parentid;
    }

    /**
     * 
     * @param parentid
     *     The parentid
     */
    @JsonProperty("parentid")
    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public ContentItem withParentid(String parentid) {
        this.parentid = parentid;
        return this;
    }

    /**
     * 
     * @return
     *     The reply
     */
    @JsonProperty("reply")
    public Boolean getReply() {
        return reply;
    }

    /**
     * 
     * @param reply
     *     The reply
     */
    @JsonProperty("reply")
    public void setReply(Boolean reply) {
        this.reply = reply;
    }

    public ContentItem withReply(Boolean reply) {
        this.reply = reply;
        return this;
    }

    /**
     * 
     * @return
     *     The forward
     */
    @JsonProperty("forward")
    public Boolean getForward() {
        return forward;
    }

    /**
     * 
     * @param forward
     *     The forward
     */
    @JsonProperty("forward")
    public void setForward(Boolean forward) {
        this.forward = forward;
    }

    public ContentItem withForward(Boolean forward) {
        this.forward = forward;
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

    public ContentItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}