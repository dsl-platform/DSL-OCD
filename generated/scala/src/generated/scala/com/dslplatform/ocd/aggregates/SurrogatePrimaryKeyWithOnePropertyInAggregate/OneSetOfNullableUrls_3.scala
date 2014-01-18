package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableUrls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableUrls: Set[Option[java.net.URI]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableUrls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableUrls_3("+ URI +")"

   def copy(oneSetOfNullableUrls: Set[Option[java.net.URI]] = this._oneSetOfNullableUrls): OneSetOfNullableUrls_3 = {

  require(oneSetOfNullableUrls ne null, "Null value was provided for property \"oneSetOfNullableUrls\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableUrls)
    new OneSetOfNullableUrls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableUrls = oneSetOfNullableUrls)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfNullableUrls_3): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableUrls = result._oneSetOfNullableUrls
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfNullableUrls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfNullableUrls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableUrls = {
    _oneSetOfNullableUrls
  }

  def oneSetOfNullableUrls_= (value: Set[Option[java.net.URI]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableUrls") oneSetOfNullableUrls: Set[Option[java.net.URI]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableUrls = if (oneSetOfNullableUrls == null) Set.empty else oneSetOfNullableUrls)

}

object OneSetOfNullableUrls_3 extends AggregateRootCompanion[OneSetOfNullableUrls_3]{

  def apply(
    oneSetOfNullableUrls: Set[Option[java.net.URI]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableUrls)
    require(oneSetOfNullableUrls ne null, "Null value was provided for property \"oneSetOfNullableUrls\"")
    new OneSetOfNullableUrls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableUrls = oneSetOfNullableUrls)
  }

}
