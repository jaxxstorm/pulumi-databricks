// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsWorkspacesNetworkGcpManagedNetworkConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("gkeClusterPodIpRange", required: true)]
        public Input<string> GkeClusterPodIpRange { get; set; } = null!;

        [Input("gkeClusterServiceIpRange", required: true)]
        public Input<string> GkeClusterServiceIpRange { get; set; } = null!;

        [Input("subnetCidr", required: true)]
        public Input<string> SubnetCidr { get; set; } = null!;

        public MwsWorkspacesNetworkGcpManagedNetworkConfigArgs()
        {
        }
        public static new MwsWorkspacesNetworkGcpManagedNetworkConfigArgs Empty => new MwsWorkspacesNetworkGcpManagedNetworkConfigArgs();
    }
}
