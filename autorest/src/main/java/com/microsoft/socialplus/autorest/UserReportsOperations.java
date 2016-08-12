/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * <autogenerated> This file was generated using AutoRest. </autogenerated>
 */

package com.microsoft.socialplus.autorest;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.socialplus.autorest.models.PostReportRequest;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in UserReportsOperations.
 */
public interface UserReportsOperations {
    /**
     * Report a user as spam, offensive, etc.
     * This call allows a user to complain about another user's profile content
     *             (photo, bio, name) as containing spam, offensive material, etc.
     *
     * @param userHandle User handle being reported on
     * @param postReportRequest Post report request
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey,TK=AccessToken
     - Google AK=AppKey,TK=AccessToken
     - Twitter AK=AppKey,[RT=RequestToken],TK=AccessToken
     - Microsoft AK=AppKey,TK=AccessToken
     - AADS2S AK=AppKey,[UH=UserHandle],TK=AADToken
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> postReport(String userHandle, PostReportRequest postReportRequest, String authorization) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Report a user as spam, offensive, etc.
     * This call allows a user to complain about another user's profile content
     *             (photo, bio, name) as containing spam, offensive material, etc.
     *
     * @param userHandle User handle being reported on
     * @param postReportRequest Post report request
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey,TK=AccessToken
     - Google AK=AppKey,TK=AccessToken
     - Twitter AK=AppKey,[RT=RequestToken],TK=AccessToken
     - Microsoft AK=AppKey,TK=AccessToken
     - AADS2S AK=AppKey,[UH=UserHandle],TK=AADToken
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall postReportAsync(String userHandle, PostReportRequest postReportRequest, String authorization, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

}
