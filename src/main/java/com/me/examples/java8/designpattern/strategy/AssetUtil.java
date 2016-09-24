/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.examples.java8.designpattern.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author trung
 */
public final class AssetUtil {

    private static int totalAssetValues(List<Asset> assets, Predicate<Asset> assetSelector) {
        return assets.stream().filter(assetSelector).mapToInt(Asset::getValue).sum();
    }

    private AssetUtil() {
    }

    public static void main(String[] args) {
        final List<Asset> assets = Arrays.asList(
                new Asset(Asset.AssetType.BOND, 1000),
                new Asset(Asset.AssetType.BOND, 2000),
                new Asset(Asset.AssetType.STOCK, 3000),
                new Asset(Asset.AssetType.STOCK, 4000)
        );

        System.out.println("Total of all assets: " + totalAssetValues(assets, asset -> true));
        System.out.println("Total of bonds: "
                + totalAssetValues(assets, asset -> Asset.AssetType.BOND == asset.getType()));
        System.out.println("Total of stocks: "
                + totalAssetValues(assets, asset -> Asset.AssetType.STOCK == asset.getType()));
    }
}
