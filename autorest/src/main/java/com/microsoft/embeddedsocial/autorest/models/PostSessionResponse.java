/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * <autogenerated> This file was generated using AutoRest. </autogenerated>
 */

package com.microsoft.embeddedsocial.autorest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response from post (create) session.
 */
public class PostSessionResponse {
    /**
     * Gets or sets user handle.
     */
    @JsonProperty(required = true)
    private String userHandle;

    /**
     * Gets or sets session token generated by our server.
     * The client saves the session token and sends it with every
     * request.
     */
    @JsonProperty(required = true)
    private String sessionToken;

    /**
     * Get the userHandle value.
     *
     * @return the userHandle value
     */
    public String getUserHandle() {
        return this.userHandle;
    }

    /**
     * Set the userHandle value.
     *
     * @param userHandle the userHandle value to set
     */
    public void setUserHandle(String userHandle) {
        this.userHandle = userHandle;
    }

    /**
     * Get the sessionToken value.
     *
     * @return the sessionToken value
     */
    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * Set the sessionToken value.
     *
     * @param sessionToken the sessionToken value to set
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

}
