// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ClusterWorkloadTypeGetArgs : Pulumi.ResourceArgs
    {
        [Input("clients", required: true)]
        public Input<Inputs.ClusterWorkloadTypeClientsGetArgs> Clients { get; set; } = null!;

        public ClusterWorkloadTypeGetArgs()
        {
        }
    }
}
