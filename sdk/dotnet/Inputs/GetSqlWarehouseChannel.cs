// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetSqlWarehouseChannelArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the Databricks SQL release channel. Possible values are: `CHANNEL_NAME_PREVIEW` and `CHANNEL_NAME_CURRENT`. Default is `CHANNEL_NAME_CURRENT`.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetSqlWarehouseChannelArgs()
        {
        }
    }
}
