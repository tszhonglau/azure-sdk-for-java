/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.azure.management.samples;

import com.microsoft.azure.management.compute.samples.CreateVirtualMachineUsingCustomImageFromVHD;
import com.microsoft.azure.management.compute.samples.CreateVirtualMachineUsingCustomImageFromVM;
import com.microsoft.azure.management.compute.samples.CreateVirtualMachineUsingSpecializedDiskFromSnapshot;
import com.microsoft.azure.management.compute.samples.CreateVirtualMachineUsingSpecializedDiskFromVhd;
import com.microsoft.azure.management.compute.samples.CreateVirtualMachinesInParallel;
import com.microsoft.azure.management.compute.samples.CreateVirtualMachinesUsingCustomImageOrSpecializedVHD;
import com.microsoft.azure.management.compute.samples.ListVirtualMachineExtensionImages;
import com.microsoft.azure.management.compute.samples.ListVirtualMachineImages;
import com.microsoft.azure.management.compute.samples.ManageAvailabilitySet;
import com.microsoft.azure.management.compute.samples.ManageVirtualMachine;
import com.microsoft.azure.management.compute.samples.ManageVirtualMachineExtension;
import com.microsoft.azure.management.compute.samples.ManageVirtualMachineScaleSet;
import com.microsoft.azure.management.compute.samples.ManageVirtualMachineWithDisk;
import com.microsoft.azure.management.compute.samples.ManageVirtualMachinesInParallel;
import com.microsoft.azure.management.compute.samples.MigrateVirtualMachine;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ComputeSampleTests extends SamplesTestBase {

    @Test
    @Ignore("Record-Play back bug")
    public void testCreateVirtualMachinesInParallel() {
        Assert.assertTrue(CreateVirtualMachinesInParallel.runSample(azure));
    }

    @Test
    @Ignore("Failing")
    public void testCreateVirtualMachinesUsingCustomImageOrSpecializedVHD() {
        Assert.assertTrue(CreateVirtualMachinesUsingCustomImageOrSpecializedVHD.runSample(azure));
    }

    @Test
    @Ignore("Failing on playback assertion error Expected :61 Actual   :0")
    public void testCreateVirtualMachineUsingCustomImageFromVHD() {
        Assert.assertTrue(CreateVirtualMachineUsingCustomImageFromVHD.runSample(azure));
    }

    @Test
    @Ignore("Failing on playback assertion error Expected :56 Actual   :0")
    public void testCreateVirtualMachineUsingCustomImageFromVM() {
        Assert.assertTrue(CreateVirtualMachineUsingCustomImageFromVM.runSample(azure));
    }

    @Test
    public void testCreateVirtualMachineUsingSpecializedDiskFromSnapshot() {
        Assert.assertTrue(CreateVirtualMachineUsingSpecializedDiskFromSnapshot.runSample(azure));
    }

    @Test
    public void testCreateVirtualMachineUsingSpecializedDiskFromVhd() {
        Assert.assertTrue(CreateVirtualMachineUsingSpecializedDiskFromVhd.runSample(azure));
    }

    @Test
    public void testListVirtualMachineExtensionImages() {
        Assert.assertTrue(ListVirtualMachineExtensionImages.runSample(azure));
    }

    @Test
    public void testListVirtualMachineImages() {
        Assert.assertTrue(ListVirtualMachineImages.runSample(azure));
    }

    @Test
    public void testManageAvailabilitySet() {
        Assert.assertTrue(ManageAvailabilitySet.runSample(azure));
    }

    @Test
    @Ignore("Failing")
    public void testManageVirtualMachine() {
        Assert.assertTrue(ManageVirtualMachine.runSample(azure));
    }

    @Test
    public void testManageVirtualMachineExtension() {
        Assert.assertTrue(ManageVirtualMachineExtension.runSample(azure));
    }

    @Test
    @Ignore("Failing")
    public void testManageVirtualMachineScaleSet() {
        Assert.assertTrue(ManageVirtualMachineScaleSet.runSample(azure));
    }

    @Test
    public void testManageVirtualMachinesInParallel() {
        Assert.assertTrue(ManageVirtualMachinesInParallel.runSample(azure));
    }

    @Test
    @Ignore("Server bug: disk size cannot be resized down")
    public void testManageVirtualMachineWithDisk() {
        Assert.assertTrue(ManageVirtualMachineWithDisk.runSample(azure));
    }

    @Test
    public void testMigrateVirtualMachine() {
        Assert.assertTrue(MigrateVirtualMachine.runSample(azure));
    }

}
