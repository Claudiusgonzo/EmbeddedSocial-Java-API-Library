/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * <autogenerated> This file was generated using AutoRest. </autogenerated>
 */

package com.microsoft.socialplus.autorest;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.socialplus.autorest.models.CommentView;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in CommentsOperations.
 */
public final class CommentsOperationsImpl implements CommentsOperations {
    /** The Retrofit service to perform REST calls. */
    private CommentsService service;
    /** The service client containing this operation class. */
    private SocialPlusClient client;

    /**
     * Initializes an instance of CommentsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public CommentsOperationsImpl(Retrofit retrofit, SocialPlusClient client) {
        this.service = retrofit.create(CommentsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for CommentsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CommentsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("v0.5/comments/{commentHandle}")
        Call<ResponseBody> getComment(@Path("commentHandle") String commentHandle, @Header("Authorization") String authorization);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "v0.5/comments/{commentHandle}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteComment(@Path("commentHandle") String commentHandle, @Header("Authorization") String authorization);

    }

    /**
     * Get comment.
     *
     * @param commentHandle Comment handle
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey|TK=AccessToken
     - Google AK=AppKey|TK=AccessToken
     - Twitter AK=AppKey|RT=RequestToken|TK=AccessToken
     - Microsoft AK=AppKey|TK=AccessToken
     - AADS2S AK=AppKey|[UH=UserHandle]|TK=AADToken
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CommentView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<CommentView> getComment(String commentHandle, String authorization) throws ServiceException, IOException, IllegalArgumentException {
        if (commentHandle == null) {
            throw new IllegalArgumentException("Parameter commentHandle is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getComment(commentHandle, authorization);
        return getCommentDelegate(call.execute());
    }

    /**
     * Get comment.
     *
     * @param commentHandle Comment handle
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey|TK=AccessToken
     - Google AK=AppKey|TK=AccessToken
     - Twitter AK=AppKey|RT=RequestToken|TK=AccessToken
     - Microsoft AK=AppKey|TK=AccessToken
     - AADS2S AK=AppKey|[UH=UserHandle]|TK=AADToken
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getCommentAsync(String commentHandle, String authorization, final ServiceCallback<CommentView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (commentHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter commentHandle is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getComment(commentHandle, authorization);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<CommentView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getCommentDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<CommentView> getCommentDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<CommentView, ServiceException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<CommentView>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Delete comment.
     *
     * @param commentHandle Comment handle
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey|TK=AccessToken
     - Google AK=AppKey|TK=AccessToken
     - Twitter AK=AppKey|RT=RequestToken|TK=AccessToken
     - Microsoft AK=AppKey|TK=AccessToken
     - AADS2S AK=AppKey|[UH=UserHandle]|TK=AADToken
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteComment(String commentHandle, String authorization) throws ServiceException, IOException, IllegalArgumentException {
        if (commentHandle == null) {
            throw new IllegalArgumentException("Parameter commentHandle is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteComment(commentHandle, authorization);
        return deleteCommentDelegate(call.execute());
    }

    /**
     * Delete comment.
     *
     * @param commentHandle Comment handle
     * @param authorization Format is: "Scheme CredentialsList". Possible values are:
     - Anon AK=AppKey
     - SocialPlus TK=SessionToken
     - Facebook AK=AppKey|TK=AccessToken
     - Google AK=AppKey|TK=AccessToken
     - Twitter AK=AppKey|RT=RequestToken|TK=AccessToken
     - Microsoft AK=AppKey|TK=AccessToken
     - AADS2S AK=AppKey|[UH=UserHandle]|TK=AADToken
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteCommentAsync(String commentHandle, String authorization, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (commentHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter commentHandle is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteComment(commentHandle, authorization);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteCommentDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteCommentDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Object, ServiceException>(this.client.getMapperAdapter())
                .register(204, new TypeToken<Object>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
