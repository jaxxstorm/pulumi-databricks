// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetClusterClusterInfoInitScriptInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("dbfs")]
        public Input<Inputs.GetClusterClusterInfoInitScriptDbfsInputArgs>? Dbfs { get; set; }

        [Input("s3")]
        public Input<Inputs.GetClusterClusterInfoInitScriptS3InputArgs>? S3 { get; set; }

        public GetClusterClusterInfoInitScriptInputArgs()
        {
        }
        public static new GetClusterClusterInfoInitScriptInputArgs Empty => new GetClusterClusterInfoInitScriptInputArgs();
    }
}
