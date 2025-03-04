// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobNewClusterInitScriptArgs : global::Pulumi.ResourceArgs
    {
        [Input("dbfs")]
        public Input<Inputs.JobNewClusterInitScriptDbfsArgs>? Dbfs { get; set; }

        [Input("file")]
        public Input<Inputs.JobNewClusterInitScriptFileArgs>? File { get; set; }

        [Input("gcs")]
        public Input<Inputs.JobNewClusterInitScriptGcsArgs>? Gcs { get; set; }

        [Input("s3")]
        public Input<Inputs.JobNewClusterInitScriptS3Args>? S3 { get; set; }

        public JobNewClusterInitScriptArgs()
        {
        }
        public static new JobNewClusterInitScriptArgs Empty => new JobNewClusterInitScriptArgs();
    }
}
