package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneStrings_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneStrings: Set[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneStrings_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneStrings_3("+ URI +")"

   def copy(oneSetOfOneStrings: Set[String] = this._oneSetOfOneStrings): OneSetOfOneStrings_3 = {

  require(oneSetOfOneStrings ne null, "Null value was provided for property \"oneSetOfOneStrings\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneStrings)
    new OneSetOfOneStrings_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneStrings = oneSetOfOneStrings)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfOneStrings_3): this.type = {
    this._URI = result._URI
    this._oneSetOfOneStrings = result._oneSetOfOneStrings
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfOneStrings_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfOneStrings")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneStrings = {
    _oneSetOfOneStrings
  }

  def oneSetOfOneStrings_= (value: Set[String]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneStrings = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneStrings") oneSetOfOneStrings: Set[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneStrings = if (oneSetOfOneStrings == null) Set.empty else oneSetOfOneStrings)

}

object OneSetOfOneStrings_3 extends AggregateRootCompanion[OneSetOfOneStrings_3]{

  def apply(
    oneSetOfOneStrings: Set[String] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneStrings)
    require(oneSetOfOneStrings ne null, "Null value was provided for property \"oneSetOfOneStrings\"")
    new OneSetOfOneStrings_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneStrings = oneSetOfOneStrings)
  }

}
