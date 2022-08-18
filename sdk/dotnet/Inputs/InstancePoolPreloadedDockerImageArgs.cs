// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class InstancePoolPreloadedDockerImageArgs : global::Pulumi.ResourceArgs
    {
        [Input("basicAuth")]
        public Input<Inputs.InstancePoolPreloadedDockerImageBasicAuthArgs>? BasicAuth { get; set; }

        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public InstancePoolPreloadedDockerImageArgs()
        {
        }
        public static new InstancePoolPreloadedDockerImageArgs Empty => new InstancePoolPreloadedDockerImageArgs();
    }
}
