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
import com.microsoft.socialplus.autorest.models.FeedResponseUserCompactView;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in UserFollowingOperations.
 */
public interface UserFollowingOperations {
    /**
     * Get following users of a user.
     *
     * @param userHandle User handle
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
     * @return the FeedResponseUserCompactView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseUserCompactView> getFollowing(String userHandle, String authorization) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get following users of a user.
     *
     * @param userHandle User handle
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
    ServiceCall getFollowingAsync(String userHandle, String authorization, final ServiceCallback<FeedResponseUserCompactView> serviceCallback) throws IllegalArgumentException;
    /**
     * Get following users of a user.
     *
     * @param userHandle User handle
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey,TK=AccessToken
     - Google AK=AppKey,TK=AccessToken
     - Twitter AK=AppKey,[RT=RequestToken],TK=AccessToken
     - Microsoft AK=AppKey,TK=AccessToken
     - AADS2S AK=AppKey,[UH=UserHandle],TK=AADToken
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseUserCompactView object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<FeedResponseUserCompactView> getFollowing(String userHandle, String authorization, String cursor, Integer limit) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get following users of a user.
     *
     * @param userHandle User handle
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey,TK=AccessToken
     - Google AK=AppKey,TK=AccessToken
     - Twitter AK=AppKey,[RT=RequestToken],TK=AccessToken
     - Microsoft AK=AppKey,TK=AccessToken
     - AADS2S AK=AppKey,[UH=UserHandle],TK=AADToken
     * @param cursor Current read cursor
     * @param limit Number of items to return
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getFollowingAsync(String userHandle, String authorization, String cursor, Integer limit, final ServiceCallback<FeedResponseUserCompactView> serviceCallback) throws IllegalArgumentException;

}
