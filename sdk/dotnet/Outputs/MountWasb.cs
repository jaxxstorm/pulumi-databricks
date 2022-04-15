// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class MountWasb
    {
        public readonly string AuthType;
        public readonly string? ContainerName;
        public readonly string? Directory;
        public readonly string? StorageAccountName;
        public readonly string TokenSecretKey;
        public readonly string TokenSecretScope;

        [OutputConstructor]
        private MountWasb(
            string authType,

            string? containerName,

            string? directory,

            string? storageAccountName,

            string tokenSecretKey,

            string tokenSecretScope)
        {
            AuthType = authType;
            ContainerName = containerName;
            Directory = directory;
            StorageAccountName = storageAccountName;
            TokenSecretKey = tokenSecretKey;
            TokenSecretScope = tokenSecretScope;
        }
    }
}