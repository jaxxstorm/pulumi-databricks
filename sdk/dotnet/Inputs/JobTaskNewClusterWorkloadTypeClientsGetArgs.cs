// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskNewClusterWorkloadTypeClientsGetArgs : Pulumi.ResourceArgs
    {
        [Input("jobs")]
        public Input<bool>? Jobs { get; set; }

        [Input("notebooks")]
        public Input<bool>? Notebooks { get; set; }

        public JobTaskNewClusterWorkloadTypeClientsGetArgs()
        {
        }
    }
}
