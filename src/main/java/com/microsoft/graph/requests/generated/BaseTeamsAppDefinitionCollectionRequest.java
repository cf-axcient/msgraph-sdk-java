// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Teams App Definition Collection Request.
 */
public class BaseTeamsAppDefinitionCollectionRequest extends BaseCollectionRequest<BaseTeamsAppDefinitionCollectionResponse, ITeamsAppDefinitionCollectionPage> implements IBaseTeamsAppDefinitionCollectionRequest {

    /**
     * The request builder for this collection of TeamsAppDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTeamsAppDefinitionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseTeamsAppDefinitionCollectionResponse.class, ITeamsAppDefinitionCollectionPage.class);
    }

    public void get(final ICallback<ITeamsAppDefinitionCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ITeamsAppDefinitionCollectionPage get() throws ClientException {
        final BaseTeamsAppDefinitionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TeamsAppDefinition newTeamsAppDefinition, final ICallback<TeamsAppDefinition> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TeamsAppDefinitionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTeamsAppDefinition, callback);
    }

    public TeamsAppDefinition post(final TeamsAppDefinition newTeamsAppDefinition) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TeamsAppDefinitionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTeamsAppDefinition);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamsAppDefinitionCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (TeamsAppDefinitionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamsAppDefinitionCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (TeamsAppDefinitionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITeamsAppDefinitionCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (TeamsAppDefinitionCollectionRequest)this;
    }

    public ITeamsAppDefinitionCollectionPage buildFromResponse(final BaseTeamsAppDefinitionCollectionResponse response) {
        final ITeamsAppDefinitionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TeamsAppDefinitionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TeamsAppDefinitionCollectionPage page = new TeamsAppDefinitionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
