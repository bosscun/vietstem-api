//
// Product.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



open class Product: Codable {

    public var name: String?
    public var feature: String?
    public var kind: String?
    public var price: String?
    public var discount: Double?
    public var id: Double?
    public var createdAt: Date?
    public var updatedAt: Date?


    
    public init(name: String? = nil, feature: String? = nil, kind: String? = nil, price: String? = nil, discount: Double? = nil, id: Double? = nil, createdAt: Date? = nil, updatedAt: Date? = nil) {
        self.name = name
        self.feature = feature
        self.kind = kind
        self.price = price
        self.discount = discount
        self.id = id
        self.createdAt = createdAt
        self.updatedAt = updatedAt
    }
    

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {

        var container = encoder.container(keyedBy: String.self)

        try container.encodeIfPresent(name, forKey: "name")
        try container.encodeIfPresent(feature, forKey: "feature")
        try container.encodeIfPresent(kind, forKey: "kind")
        try container.encodeIfPresent(price, forKey: "price")
        try container.encodeIfPresent(discount, forKey: "discount")
        try container.encodeIfPresent(id, forKey: "id")
        try container.encodeIfPresent(createdAt, forKey: "createdAt")
        try container.encodeIfPresent(updatedAt, forKey: "updatedAt")
    }

    // Decodable protocol methods

    public required init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: String.self)

        name = try container.decodeIfPresent(String.self, forKey: "name")
        feature = try container.decodeIfPresent(String.self, forKey: "feature")
        kind = try container.decodeIfPresent(String.self, forKey: "kind")
        price = try container.decodeIfPresent(String.self, forKey: "price")
        discount = try container.decodeIfPresent(Double.self, forKey: "discount")
        id = try container.decodeIfPresent(Double.self, forKey: "id")
        createdAt = try container.decodeIfPresent(Date.self, forKey: "createdAt")
        updatedAt = try container.decodeIfPresent(Date.self, forKey: "updatedAt")
    }
}

