// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserExportPersonalDataRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Export Personal Data Request Builder.
 */
public interface IUserExportPersonalDataRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IUserExportPersonalDataRequest
     *
     * @return the IUserExportPersonalDataRequest instance
     */
    IUserExportPersonalDataRequest buildRequest();

    /**
     * Creates the IUserExportPersonalDataRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IUserExportPersonalDataRequest instance
     */
    IUserExportPersonalDataRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
