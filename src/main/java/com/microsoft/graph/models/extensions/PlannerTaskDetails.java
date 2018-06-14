// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.generated.BasePlannerTaskDetails;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Planner Task Details.
 */
public class PlannerTaskDetails extends BasePlannerTaskDetails {
	
	/**
     * The Etag.
     */
    @SerializedName("@odata.etag")
    @Expose
    public String etag;
    
    public PlannerTaskDetails() {
    	oDataType = "#microsoft.graph.plannerTaskDetails";
    }
}
