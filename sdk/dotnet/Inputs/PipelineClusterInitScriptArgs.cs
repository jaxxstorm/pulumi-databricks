// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PipelineClusterInitScriptArgs : global::Pulumi.ResourceArgs
    {
        [Input("dbfs")]
        public Input<Inputs.PipelineClusterInitScriptDbfsArgs>? Dbfs { get; set; }

        [Input("file")]
        public Input<Inputs.PipelineClusterInitScriptFileArgs>? File { get; set; }

        [Input("gcs")]
        public Input<Inputs.PipelineClusterInitScriptGcsArgs>? Gcs { get; set; }

        [Input("s3")]
        public Input<Inputs.PipelineClusterInitScriptS3Args>? S3 { get; set; }

        public PipelineClusterInitScriptArgs()
        {
        }
        public static new PipelineClusterInitScriptArgs Empty => new PipelineClusterInitScriptArgs();
    }
}
