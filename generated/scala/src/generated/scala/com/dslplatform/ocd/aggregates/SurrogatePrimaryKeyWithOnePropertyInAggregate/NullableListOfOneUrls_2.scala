package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneUrls_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneUrls_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneUrls_2("+ URI +")"

   def copy(nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]] = this._nullableListOfOneUrls): NullableListOfOneUrls_2 = {

  require(nullableListOfOneUrls ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
  if(nullableListOfOneUrls.isDefined) require(nullableListOfOneUrls.get ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneUrls)
    new NullableListOfOneUrls_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneUrls = nullableListOfOneUrls)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneUrls_2): this.type = {
    this._URI = result._URI
    this._nullableListOfOneUrls = result._nullableListOfOneUrls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneUrls_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneUrls")
  def nullableListOfOneUrls = {
    _nullableListOfOneUrls
  }

  def nullableListOfOneUrls_= (value: Option[IndexedSeq[java.net.URI]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneUrls") nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneUrls = nullableListOfOneUrls)

}

object NullableListOfOneUrls_2 extends AggregateRootCompanion[NullableListOfOneUrls_2]{

  def apply(
    nullableListOfOneUrls: Option[IndexedSeq[java.net.URI]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneUrls)
    require(nullableListOfOneUrls ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
    if (nullableListOfOneUrls.isDefined) require(nullableListOfOneUrls.get ne null, "Null value was provided for property \"nullableListOfOneUrls\"")
    new NullableListOfOneUrls_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneUrls = nullableListOfOneUrls)
  }

}
