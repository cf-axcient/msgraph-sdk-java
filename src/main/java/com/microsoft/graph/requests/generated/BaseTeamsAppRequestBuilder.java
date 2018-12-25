// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.ITeamsAppRequest;
import com.microsoft.graph.requests.extensions.TeamsAppRequest;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Teams App Request Builder.
 */
public class BaseTeamsAppRequestBuilder extends BaseRequestBuilder implements IBaseTeamsAppRequestBuilder {

    /**
     * The request builder for the TeamsApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTeamsAppRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ITeamsAppRequest instance
     */
    public ITeamsAppRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITeamsAppRequest instance
     */
    public ITeamsAppRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new TeamsAppRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITeamsAppDefinitionCollectionRequestBuilder appDefinitions() {
        return new TeamsAppDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appDefinitions"), getClient(), null);
    }

    public ITeamsAppDefinitionRequestBuilder appDefinitions(final String id) {
        return new TeamsAppDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("appDefinitions") + "/" + id, getClient(), null);
    }
}

