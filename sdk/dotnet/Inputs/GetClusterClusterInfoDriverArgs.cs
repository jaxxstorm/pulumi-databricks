// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetClusterClusterInfoDriverInputArgs : Pulumi.ResourceArgs
    {
        [Input("hostPrivateIp")]
        public Input<string>? HostPrivateIp { get; set; }

        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        [Input("nodeAwsAttributes")]
        public Input<Inputs.GetClusterClusterInfoDriverNodeAwsAttributesInputArgs>? NodeAwsAttributes { get; set; }

        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        [Input("publicDns")]
        public Input<string>? PublicDns { get; set; }

        [Input("startTimestamp")]
        public Input<int>? StartTimestamp { get; set; }

        public GetClusterClusterInfoDriverInputArgs()
        {
        }
    }
}
